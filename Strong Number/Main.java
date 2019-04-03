#include <stdio.h>
int main() {
	int n;
	scanf("%d", &n);
	int temp = n;
	int add = 0;
	while(temp > 0){
	    int remn = temp % 10;
	    int facts = 1;
	    for(int i = 1; i <= remn; i++){
	        facts = facts * i;
	    }
	    add = add + facts;
	    temp = temp / 10;
	}
	if(n == add){
	    printf("Yes");
	}
	else{
	    printf("No");
	}
	return 0;
}