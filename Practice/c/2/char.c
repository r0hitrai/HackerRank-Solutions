// including standard input output
#include<stdio.h>
// maximum length of string
#define MAX 100
// main function
int main() {
	// char variable and arrays
	char ch, s[MAX], sen[MAX];
	// reading char input
	scanf("%c", &ch);
	// reading string input and discarding \n that comes after it
	scanf("%s%*c", s);
	// reading all characters till \n and then discarding that \n
    scanf("%[^\n]%*c", sen);
	// printing final result
	printf("%c\n%s\n%s\n", ch, s, sen);
	// returning 0 from main function
	return 0;
}
