/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Perfect Permutation
 * Problem-Link : https://codeforces.com/problemset/problem/233/A
*/

#include<stdio.h>

int main(int argc,char** argv){
	int n;
	scanf("%d",&n);
	if(n%2==1)
		printf("-1\n");
	else{
		for(int i=0;i<n;i+=2){
			printf("%d ",i+2);
			printf(i+2>=n?"%d\n":"%d ",i+1);
		}
	}
	return 0;
}
