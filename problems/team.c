/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Team
 * Problem-Link : https://codeforces.com/problemset/problem/231/A
*/

#include<stdio.h>

int main(int argc,char** argv){
	int n,number,countColum,countRow;
	scanf("%d",&n);
	countColum=0;
	countRow=0;
	for(int i=0;i<n;i++){
		for(int j=0;j<3;j++){
			scanf("%d",&number);
			countColum+=number==1?1:0;
		}
		countRow+=countColum>=2?1:0;
		countColum=0;
	}
	printf("%d\n",countRow);
	return 0;
}
