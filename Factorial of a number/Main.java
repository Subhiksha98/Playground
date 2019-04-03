#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int pdt=1;
  int i;
  for(i=1 ;i<=n ;i++){
    pdt=pdt*i;
  
  }
      printf("%d",pdt);

	return 0;
}