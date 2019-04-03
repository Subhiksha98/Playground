#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
  int sum = ((num%100)%10)+ (num/100);
  printf("%d",sum);
  return 0;
}