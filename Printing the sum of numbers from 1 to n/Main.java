#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int sum=0;
  for(int num=0; num<=n; num++){
    sum += num;
  
  }
  printf("%d",sum);
	return 0;
}