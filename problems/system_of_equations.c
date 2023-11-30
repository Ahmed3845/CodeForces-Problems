/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. System of Equations
 * Problem-Link : https://codeforces.com/problemset/problem/214/A
*/

#include<stdio.h>

int main(int argc,char** argv){
	int n,m,pairs;
	scanf("%d",&n);
	scanf("%d",&m);
	pairs=0;
	for(int a=0;a<=m;a++){
		for(int b=0;b<=n;b++){
			pairs+=a*a+b==n&&b*b+a==m?1:0;
		}
	}
	printf("%d\n",pairs);
	return 0;
}
