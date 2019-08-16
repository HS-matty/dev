// Radmaster ANSI-C Library
// Written by matty (byqdes@gmail.com) 

#include "console/ansi.c"

int echo (_str){
	return echo_string(_str);
}
int echo_string(_str){
	printf(_str);
//	puts(_str);
	return 0;
}
void echo_new_line(){
	printf("\n\r");
}

void echo_line(){
	
}




