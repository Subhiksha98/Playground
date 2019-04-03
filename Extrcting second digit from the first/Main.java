#include <stdio.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  int sum;
  if(a > 10000){
    sum = ((a%10000)/1000);
  }
  else if (a>10 && a < 10000){
    sum = a%10;
  
  }
  printf("%d",sum);
	return 0;
}