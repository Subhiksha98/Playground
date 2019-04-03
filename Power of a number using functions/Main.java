#include<stdio.h>
int power(int b, int exponent);
int main(){
    int b, exponent;
    scanf("%d%d", &b, &exponent);
    printf("%d", power(b, exponent));// Function call
  	return 0;
}
// Function to find the power of a number
int power(int b, int exponent)
{
    int power = 1;
    while(exponent >= 1)
    {
        power = power * b;
        exponent--;
    }
    return power;
}