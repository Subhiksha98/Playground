#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  for(int num=1; num<=n; num++){
    if(num%3==0){
      printf("%d",num);
       printf(",");

    }
     else if(num%3!= 0) {
      printf("%d",num);
       
    }
  
  }
	return 0;
  
}