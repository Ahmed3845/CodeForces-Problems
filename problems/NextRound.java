/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Next Round
 * Problem-Link : https://codeforces.com/problemset/problem/158/A
*/

import java.util.Scanner;
import java.util.Arrays;

public class NextRound{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String inp1=scanner.nextLine(),inp2=scanner.nextLine();
		int n=Integer.parseInt(inp1.substring(0,inp1.indexOf(' '))),
		k=Integer.parseInt(inp1.substring(inp1.indexOf(' ')+1));
		int[] scores=new int[n];
		int h=0,index=0;
		for(int i=0;i<inp2.length();i++){
			if(inp2.charAt(i)==' ' || i==inp2.length()-1){
				scores[index]=inp2.charAt(i)==' '?Integer.parseInt(inp2.substring(h,i)):Integer.parseInt(inp2.substring(h));
				h=i+1;
				index++;
			}
		}
		int result=0;
		for(int i=0;i<n;i++){
			result+=scores[i]>0&&scores[i]>=scores[k-1]?1:0;
		}
		System.out.println(result);
		scanner.close();
	}
}