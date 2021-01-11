.model tiny
.code
.386
org 100h

start: mov al,13h
int 10h

mov si,0x11111h
push si
call mem_save
ret



mem_save proc near
pop si
ret
mem_save endp

end start