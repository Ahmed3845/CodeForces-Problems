/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Series of Crimes
 * Problem-Link : https://codeforces.com/problemset/problem/181/A
*/

#include<stdio.h>

int main(int argc,char** argv){
	int n,m,p1x,p1y,p2x,p2y,p3x,p3y,p4x,p4y,point=1;
	char c;
	scanf("%d %d",&n,&m);
	for(int i=1;i<=n;i++){
		char line[m];
		scanf("%s",line);
		for(int j=0;j<m;j++){
			if(*(line+j)=='*'){
				switch(point){
					case 1:{p1x=i;p1y=j+1;break;}
					case 2:{p2x=i;p2y=j+1;break;}
					case 3:{p3x=i;p3y=j+1;break;}
				}
				point++;
			}
		}
	}

	p4x=p1x==p2x?p3x:p1x==p3x?p2x:p2x==p3x?p1x:-1;
	p4y=p1y==p2y?p3y:p1y==p3y?p2y:p2y==p3y?p1y:-1;
	printf("%d %d\n",p4x,p4y);
	return 0;
}
