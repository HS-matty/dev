// Radmaster Compiler Test
// Written by matty (byqdes@gmail.com) / (10-07-2019)
#include <stdio.h>

typedef struct class_test_class_struct {
	int a;

}class_test_class_struct;

int class_test_class_function_test_construct(){
	return 25;
}


int main() {
	
	int b;
	printf("test");

	b = class_test_class_function_test_construct();
	printf("some printf test %1",b);
	return 0;
}


