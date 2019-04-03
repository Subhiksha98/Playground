#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  for(int num=1; num<=n; num++){
    if(num%2 != 0){
      printf("%d\n",num);
    }
  }
	return 0;
}