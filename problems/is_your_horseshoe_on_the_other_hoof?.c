/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Is your horseshoe on the other hoof?
 * Problem-Link : https://codeforces.com/problemset/problem/228/A
*/

#include<stdio.h>

int main(int argc,char** argv){
	long long n1,n2,n3,n4;
	int result=0;
	scanf("%lld",&n1);
	scanf("%lld",&n2);
	scanf("%lld",&n3);
	scanf("%lld",&n4);
	result+=(n1==n2||n1==n3||n1==n4)?1:0;
	result+=(n2==n3||n2==n4)?1:0;
	result+=(n3==n4)?1:0;
	printf("%d\n",result);
	return 0;
}
