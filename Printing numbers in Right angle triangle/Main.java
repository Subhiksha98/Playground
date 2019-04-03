#include <stdio.h>
int main(){
  	// Type your code here
  int n;
  scanf("%d",&n);
  int row,col;
  for(row = 1;row<=n;row++){
    for(col=1;col<=row;col++){
      printf("%d",row);
    
    }
    printf("\n");
  }
	return 0;
}