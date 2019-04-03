#include<stdio.h>
int sum(int num);// Function declaration
int main() {
   int n;
   scanf("%d", &n);
   printf("%d", sum(n)); // Function call
  	return 0;
}
int sum(int num){// Function definition
    int sums = 0;
    for(int i = 1; i <= num; i++){
        sums = sums + i;
    }
    return sums;
}
