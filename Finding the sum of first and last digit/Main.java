#include <stdio.h>
int main() {
	//Type your code
  int a ;
  scanf("%d",&a);
  int num;
  if(a>1000 && a<10000){
    num = (a/1000)+(((a%1000)%100)%10);
  }
  else if(a>1000){
    num = (a/10000)+((((a%10000)%1000)%100)%10);
  }
  printf("%d",num);
  
	return 0;
}