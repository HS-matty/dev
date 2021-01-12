.model tiny
.code
.386
org 100h

start: mov al,13h
int 10h

mov si,0x11111h
push si
call mem_save_dword
ret



mem_save_dword proc near
pop si
ret
mem_save_dword endp

end start