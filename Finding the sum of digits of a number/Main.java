#include <stdio.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  int sum;
  if(a>100 && a<10000){
    sum = (a/100)+(a%100);
  
  }
  else if(a>10000){
   sum = (a/10000)+((a%10000)/1000)+(((a%10000)%1000)/100)+((((a%10000)%1000)%100)/10)+((((a%10000)%1000)%100)%10);
  }
 
  printf("%d",sum);
	return 0;
}