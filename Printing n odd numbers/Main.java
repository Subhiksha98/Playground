#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  for(int n = 0; n<= ((num*2)-1); n++){
    if(n%2 != 0){
      printf("%d\n",n);
    }
  }
	return 0;
}