/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. I_love_%username%
 * Problem-Link : https://codeforces.com/problemset/problem/155/A
*/

import java.util.Scanner;

public class ILoveUsername{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		String contests=scanner.nextLine();
		int[] scores=new int[n];
		int h=0,index=0,amazing_contests=0,lowest=0,highest=0;
		for(int i=0;i<contests.length();i++){
			if(contests.charAt(i)==' ' || i==contests.length()-1){
				scores[index]=contests.charAt(i)==' '?Integer.parseInt(contests.substring(h,i)):Integer.parseInt(contests.substring(h));
				if(index!=0){
					amazing_contests+=scores[index]>highest||scores[index]<lowest?1:0;
					highest=scores[index]>highest?scores[index]:highest;
					lowest=scores[index]<lowest?scores[index]:lowest;
				}else{
					lowest=scores[index];
					highest=scores[index];
				}
				h=i+1;
				index++;
			}
		}
		System.out.println(amazing_contests);
		scanner.close();
	}
}