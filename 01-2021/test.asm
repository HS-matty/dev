;draft by [BelQ]Sergik //Minsk / Belarus

.model tiny
.code
.386
org 100h

start: mov al,13h
int 10h

mov si,0x11111h
;push si
call mem_save_dword

mov si,0x11111h
call mem_load_dword

;get dword

;mov dx,di
mov si,di


mov dx,010101h
call stack_push 

call api_console_echo

ret


stack_push proc near

mov si,offset dx
call mem_save_dword

stack_push endp


api_console_echo proc near

mov al, CONSOLE_OUTPUT
mov dx, offset si
int 10h 
ret
api_console_echo endp


mem_load_dword proc near
pop si 
;get the address

mov di,0x00001h ;// the address
ret
mem_load_dword endp

mem_save_dword proc near
;pop si
ret
mem_save_dword endp

end start