#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
  int sld =(((num%10000)%1000)%100)/10;
  printf("%d",sld);
  return 0;
}