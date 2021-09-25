// including standard input output
#include<stdio.h>
// main function
int main() {
    // integer variables
    int num1, num2;
    // floating varibales
    float num3, num4;
    // scanning integers
    scanf("%d %d", &num1, &num2);
    // scanning floats
    scanf("%f %f", &num3, &num4);
    // printing sum and diff of integers
    printf("%d %d\n", num1 + num2, num1 - num2);
    // printing sum and diff of floats
    printf("%.1f %.1f\n", num3 + num4, num3 - num4);
    // returning 0 from main function
    return 0;
}
