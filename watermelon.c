/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Watermelon
 * Problem-Link : https://codeforces.com/contest/4/problem/A 
*/

#include<stdio.h>
#include<stdbool.h>

bool watermelon(int n){
	return n<=2||n%2!=0?false:true;
}

int main(int argc,char** argv){
	int n;
	bool result;
	scanf("%d",&n);
	result=watermelon(n);
	printf(result==1?"YES":"NO");
	return 0;
}
