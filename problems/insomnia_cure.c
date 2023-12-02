/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Insomnia cure
 * Problem-Link : https://codeforces.com/problemset/problem/148/A
*/

#include<stdio.h>

int main(int argc,char** argv){
	int k,l,m,n;
	long int d,result=0;
	scanf("%d",&k);
	scanf("%d",&l);
	scanf("%d",&m);
	scanf("%d",&n);
	scanf("%ld",&d);

	for(long int i=1;i<=d;i++){
		result+=i%k==0||i%l==0||i%m==0||i%n==0?1:0;
	}
	printf("%ld",result);
	return 0;
}
