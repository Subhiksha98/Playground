#include <stdio.h> 
#include<math.h>
int main() 
{ 
    int a, add = 0, temp, rem, digit = 0; 
    scanf("%d", &a);  
    temp = a; 
    while (temp != 0) 
    { 
        digit++; 
        temp = temp / 10; 
    } 
    temp = a; 
 
    while (temp != 0) 
    { 
        rem = temp % 10; 
        add = add + pow(rem, digit); 
        temp = temp / 10; 
    }  
    if (a == add) 
        printf("Armstrong Number"); 
    else 
        printf("Not an Armstrong Number");  
    return 0; 
}