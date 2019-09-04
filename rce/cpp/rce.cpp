// written by HS-matty byqdes@gmail.com
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <assert.h>
#include <signal.h>

//#include <string>
#include "rce.h"
//#include "Test.cpp"

using namespace std;

#define TEST_CONST 0xffffff
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

class Test{
	public:
		Test(){
		}
		~Test(){
		}
		void echo(const char *_str) {
			printf(_str);
		}
		
		void echo_int(int number) {
			printf("%i",number);
		}
		
		void echo_newline() {
			printf("\n");
		}
};

int main(int argc, char** argv) {
	//printf("test");
	Test _test;
	_test.echo("cpp class test");
	_test.echo_newline();
//	char _const = *(char)TEST_CONST;
	_test.echo_int(TEST_CONST);
	_test.echo_newline();
	getchar();
	raise(SIGTERM);
	
	
	//_test->echo("hello usin classes");
	return 0;
}







