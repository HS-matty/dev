// Radmaster ANSI-C Library
// Written by matty (byqdes@gmail.com) 


#define ESCAPE_CODE "\033["
//some code from stackoverflow ;D
//fonts color
#define ANSI_COLOR_FOREGROUND_BLACK      "30"
#define ANSI_COLOR_FOREGROUND_RED        "31"
#define ANSI_COLOR_FOREGROUND_GREEN      "32"
#define ANSI_COLOR_FOREGROUND_YELLOW     "33"
#define ANSI_COLOR_FOREGROUND_BLUE       "34"
#define ANSI_COLOR_FOREGROUND_PURPLE     "35"
//#define ANSI_COLOR_FOREGROUND_GREEN    "6"
#define ANSI_COLOR_FOREGROUND_WHITE      "7"
//#define FCYAN       "\x1b[36m"

//background color
#define ANSI_COLOR_BACKGROUND_BLACK      "40"
#define ANSI_COLOR_BACKGROUND_BLACK_RED        "41"
#define ANSI_COLOR_BACKGROUND_BLACK_GREEN      "42"
#define ANSI_COLOR_BACKGROUND_BLACK_YELLOW     "43"
#define ANSI_COLOR_BACKGROUND_BLACK_BLUE       "44"
#define ANSI_COLOR_BACKGROUND_BLACK_PURPLE     "45"
#define ANSI_COLOR_BACKGROUND_BLACK_BGREEN    "46"
#define ANSI_COLOR_BACKGROUND_BLACK_WHITE      "47"

//end color
#define ANSI_COLOR_NONE        "0"


void echo_set_color(color){
	echo(ESCAPE_CODE);
	echo(color);
	echo(";");
}

void echo_set_color_red(){
	printf("\033[1;31m");
 //printf(D_FGREEN BBLUE"Change color!\n"NONE);

}
void echo_set_color_blue(){
	printf("\033[1;34m");
 //printf(D_FGREEN BBLUE"Change color!\n"NONE);

}
//void echo_set_color_blue(){

 //printf(D_FGREEN BBLUE"Change color!\n"NONE);
//	printf(ANSI_COLOR_FOREGROUND_BLUE);
///}

void echo_set_color_none(){

 printf("\033[1;0m");
	//printf(ANSI_COLOR_NONE);
}

void echo_set_background_color(color){
	echo_string(color);
}


