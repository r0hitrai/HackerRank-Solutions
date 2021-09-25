// importing standard input output library
#include<stdio.h>
// maximum string length
#define SIZE 100
// main function
int main() {
    // array of character for string s
    char s[SIZE];
    // reading everything other than new line (\n) and then discraeding new line (\n)
    scanf("%[^\n]%*c", s);
    // printing required output
    printf("Hello, World!\n%s", s);
    // returning 0 to for main function
    return 0;
}
