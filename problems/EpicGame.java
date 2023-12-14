/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Epic Game
 * Problem-Link : https://codeforces.com/problemset/problem/119/A
*/

import java.util.Scanner;

public class EpicGame{
	public static int gcd(int a,int b){
		if(a==0) return b;
		else if(b==0) return a;

		if(a>b){
			a=a+b;
			b=a-b;
			a-=b;
		}else{
			b=a+b;
			a=b-a;
			b-=a;
		}
		int r=a%b;
		while(r!=0){
			a=b;
			b=r;
			r=a%b;
		}
		return b;
	}

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		int[] values=new int[3];
		int k=0,h=0;
		for(int i=0;i<line.length();i++){
			if(line.charAt(i)==' '||i==line.length()-1){
				values[k]=i!=line.length()-1?Integer.parseInt(line.substring(h,i)):Integer.parseInt(line.substring(h));
				h=i+1;
				k++;
			}
		}
		int simon,antisimon;
		boolean antisimonWins=false;

		while(values[2]>=0){
			simon=gcd(values[0],values[2]);
			values[2]-=simon;
			if(values[2]<0){
				antisimonWins=true;
				break;
			}
			antisimon=gcd(values[1],values[2]);
			values[2]-=antisimon;
		}
		System.out.println(antisimonWins?"1":"0");
		scanner.close();
	}
}