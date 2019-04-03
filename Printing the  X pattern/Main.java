
#include<stdio.h>
void main()
{
    int x,y,n;
  scanf("%d",&n);
  for(x=1;x<=n;x++){
    for(y=1;y<=n;y++){
      if(x==y || x+y==n+1){
        printf("*");
      
      }
      else
      {
         printf(" ");
      }
    
    }
    printf("\n");
  }
}