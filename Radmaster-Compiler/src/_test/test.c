// Radmaster Compiler Test
// Written by matty (byqdes@gmail.com) / (10-07-2019)
// 223018_BELARUS_MINSK_REGION_TARASOVO_FRUNZENSKAYA_31;017_5022745;SIARHEI_M_VAUCHOK_04_12_1981;MARIA_V_ASTROUKA_09_11_1982;+375259520051;


#include <stdio.h>
#include <windows.h>

#define RADMASTER_COMPILER_NAME "Radmaster Compiler Test"
#define RADMASTER_COMPILER_VERSION "0.1"
#define RADMASTER_COMPILER_PLATFORM "win32"
#define RADMASTER_COMPILER_AUTHOR_NAME "Siarhei M. Vauchok (matty@hytex.radmaster.net)"
#define RADMASTER_COMPILER_AUTHOR_MESSAGE "Written by matty (10-07-2019)"
#define RADMASTER_COMPILER_AUTHOR_ADDRESS "223018_BELARUS_MINSK_REGION_TARASOVO_FRUNZENSKAYA_31;017_5022745;SIARHEI_M_VAUCHOK_04_12_1981;MARIA_V_ASTROUKA_09_11_1982;+375259520051;"


//some definitions here

 typedef unsigned int R_WINDOW_ID;
 

//end definitions


//some code from stackoverflow ;D
//fonts color
#define FBLACK      "\033[30;"
#define FRED        "\033[31;"
#define FGREEN      "\033[32;"
#define FYELLOW     "\033[33;"
#define FBLUE       "\033[34;"
#define FPURPLE     "\033[35;"
#define D_FGREEN    "\033[6;"
#define FWHITE      "\033[7;"
#define FCYAN       "\x1b[36m"

//background color
#define BBLACK      "40m"
#define BRED        "41m"
#define BGREEN      "42m"
#define BYELLOW     "43m"
#define BBLUE       "44m"
#define BPURPLE     "45m"
#define D_BGREEN    "46m"
#define BWHITE      "47m"

//end color
#define NONE        "\033[0m"

//end overflow 
//const char g_szClassName[] = "myWindowClass";
//LRESULT CALLBACK WndProc(HWND hwnd, UINT msg, WPARAM wParam, LPARAM lParam)
//{
 //   switch(msg)
 //   {
  //      case WM_CLOSE:
  //          DestroyWindow(hwnd);
  //      break;
//        case WM_DESTROY:
 //           PostQuitMessage(0);
  //      break;
 //       default:
 ///           return DefWindowProc(hwnd, msg, wParam, lParam);
 //   }
 //   return 0;/
//}


typedef struct Class_Registry {
	int a;
}Class_Registry;

//int Class_Regis
int Class_Registry_Add_int(int_var){
}


int  gui_create_window(){
	int w_id;
	
	//MessageBox(NULL,L"test",L"test", MB_OK);
	
	w_id = 8711;
	return w_id;	
	
	
}

BOOLEAN gui_close_window(R_WINDOW_ID w_id){
	//
	//
	return TRUE;
}

typedef struct class_test_class_struct {
	int a;

}class_test_class_struct;

int class_test_class_function_test_construct(){
	return 25;
}


typedef struct wnd_class{
	int a;
} wnd_class;

int main() {
	
	int b,w_id;
	
//	const char _str[] = "test2";
//	printf("test");

//	b = class_test_class_function_test_construct();
//	printf("some printf test %1",b);
	//echo_new_line();
//	echo_set_color_red();
	//echo_string(_str);
	//echo_new_line();
	//draw_window();
	//HWND hwnd;  
//	MessageBox(hwnd,"test",);
//	FreeConsole();
	//MessageBox(NULL,L"test",L"test", MB_OK);
	//CreateWindowEx
	
//	w_id = gui_create_window();
	
//	getchar();
	//gui_close_window(w_id);
	return 0;
}


int echo (_str){
	return echo_string(_str);
}
int echo_string(_str){
	printf(_str);
//	return 0;
}
void echo_new_line(){
	printf("\n\r");
}
void echo_set_color_red(){
//	printf("\033[1;31m");
 //printf(D_FGREEN BBLUE"Change color!\n"NONE);

}

void echo_set_background_color(color){
	echo_string(color);
}
void echo_line(){
	
}

void console_show_build_version(){
	
	echo_new_line();
	echo("Build information: ");
	echo(__STDC__);
	echo(", ");
	echo(__DATE__);
	echo(", ");
	echo(__TIME__);
	
}

void console_show_credits(){
	echo(RADMASTER_COMPILER_NAME);
	echo_new_line();
	echo(RADMASTER_COMPILER_AUTHOR_NAME);
	echo_new_line();
	echo(RADMASTER_COMPILER_AUTHOR_MESSAGE);
	echo_new_line();
	echo(RADMASTER_COMPILER_AUTHOR_ADDRESS);
	echo_new_line();
	console_show_build_version();
	
	
}


int draw_window(){
	
	echo_set_background_color(BBLUE);
	int i;
	for(i=0;i<50;i++){
		echo('#');
	}
	
}


/*
	LPSTR lpCmdLine = "";
	int nCmdShow = 0;
	
	WNDCLASSEX wc;
    HWND hwnd;
    MSG Msg;
	HINSTANCE hInstance = (HINSTANCE)GetModuleHandle(NULL);
    //Step 1: Registering the Window Class
    wc.cbSize        = sizeof(WNDCLASSEX);
    wc.style         = 0;
    wc.lpfnWndProc   = WndProc;
    wc.cbClsExtra    = 0;
    wc.cbWndExtra    = 0;
    wc.hInstance     = hInstance;
    wc.hIcon         = LoadIcon(NULL, IDI_APPLICATION);
    wc.hCursor       = LoadCursor(NULL, IDC_ARROW);
    wc.hbrBackground = (HBRUSH)(COLOR_WINDOW+1);
    wc.lpszMenuName  = NULL;
    wc.lpszClassName = g_szClassName;
    wc.hIconSm       = LoadIcon(NULL, IDI_APPLICATION);

    if(!RegisterClassEx(&wc))
    {
        MessageBox(NULL, "Window Registration Failed!", "Error!",
            MB_ICONEXCLAMATION | MB_OK);
        return 0;
    }

    // Step 2: Creating the Window
    hwnd = CreateWindowEx(
        WS_EX_CLIENTEDGE,
        g_szClassName,
        "The title of my window",
        WS_OVERLAPPEDWINDOW,
        CW_USEDEFAULT, CW_USEDEFAULT, 240, 120,
        NULL, NULL, hInstance, NULL);

    if(hwnd == NULL)
    {
        MessageBox(NULL, "Window Creation Failed!", "Error!",
            MB_ICONEXCLAMATION | MB_OK);
        return 0;
    }

    ShowWindow(hwnd, nCmdShow);
    UpdateWindow(hwnd);

    // Step 3: The Message Loop
 //   while(GetMessage(&Msg, NULL, 0, 0) > 0)
  //  {
  //      TranslateMessage(&Msg);
  //      DispatchMessage(&Msg);
  //  }
  //  return Msg.wParam;

*/
