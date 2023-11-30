/* 
 * Author 		: Ahmed Sellami
 * Problem-Name : A. Way Too Long Words
 * Problem-Link : https://codeforces.com/problemset/problem/71/A 
*/

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include <math.h>

void getWords(int n,char** strings){
	for(int i=0;i<n;i++){
		*(strings+i)=(char*)malloc(100*sizeof(char));
		scanf("%s",*(strings+i));
		*(*(strings+i)+strlen(*(strings+i)))='\0';
	}
}

void abbreviate(int n,char** strings){
	for(int i=0;i<n;i++){
		if(strlen(*(strings+i))>10){
			char* length=(char*)malloc((((int)(log10(strlen(*(strings+i))-2)))+2)*sizeof(char));
			sprintf(length,"%d",(int)(strlen(*(strings+i)))-2);
			*(length+(((int)(log10(strlen(*(strings+i))-2)))+1))='\0';
			char newWord[strlen(length)+3];
			*(newWord)=*(*(strings+i));
			for(int start=1;start<strlen(length)+1;start++)
				*(newWord+start)=*(length+start-1);
			*(newWord+strlen(length)+1)=*(*(strings+i)+strlen(*(strings+i))-1);
			*(newWord+strlen(length)+2)='\0';
			strcpy(*(strings+i),"");
			strcpy(*(strings+i),newWord);
			free(length);
		}
	}
}

int main(int argc,char** argv){
	int n;
	scanf("%d",&n);
	char** strings=(char**)malloc(n*sizeof(char*));
	getWords(n,strings);
	abbreviate(n,strings);
	for(int i=0;i<n;i++){
		printf("%s\n",*(strings+i));
	}
	free(strings);
	return 0;
}
