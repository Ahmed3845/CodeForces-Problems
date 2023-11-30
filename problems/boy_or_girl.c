/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Boy or Girl
 * Problem-Link : https://codeforces.com/problemset/problem/236/A
*/

#include<stdio.h>
#include<string.h>
#include<stdbool.h>

int main(int argc,char** argv){
	char username[100];
	int length=0;
	bool repeat;
	
	scanf("%s",username);
	for(int i=0;i<strlen(username);i++){
		repeat=false;
		if(i==0)
			length++;
		else{
			for(int j=i-1;j>=0;j--){
				if(*(username+j)==*(username+i)){
					repeat=true;
					break;
				}
			}
			if(repeat)
				continue;
			length++;
		}
	}
	printf(length%2==0?"CHAT WITH HER!\n":"IGNORE HIM!\n");
	return 0;
}
