/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. LLPS
 * Problem-Link : https://codeforces.com/problemset/problem/202/A
*/

import java.util.Scanner;

public class Llps{
	public static boolean isPalindrome(String string){
		String result="";
		for(int i=string.length()-1;i>=0;i--)
			result+=string.charAt(i);
		return result.equals(string);
	}

	public static boolean cond1(String s1,String s2){
		if(s1.length()<=s2.length())
			return false;
		for(int i=0;i<s2.length();i++){
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
		}
		return true;
	}

	public static boolean cond2(String s1,String s2){
		int shortLength=s1.length()>s2.length()?s2.length():s1.length();
		for(int r=0;r<shortLength;r++){
			for(int j=0;j<r;j++){
				if(s1.charAt(j)!=s2.charAt(j))
					break;
			}
			if(s1.charAt(r)>s2.charAt(r))
				return true;
		}
		return false;
	}

	public static boolean isLarger(String s1,String s2){
		return cond1(s1,s2)||cond2(s1,s2);
	}

	public static void divide(int start,String str,StringBuilder largest,String origin){
		if(start!=0 && isPalindrome(str) && isLarger(str,largest.toString())){
			largest=largest.replace(0,largest.length(),str);
		}
		if(start==origin.length())
			return;
		divide(start+1,str+origin.charAt(start),largest,origin);
		divide(start+1,str,largest,origin);
	}

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String origin=scanner.nextLine();
		StringBuilder largest=new StringBuilder();
		String str=new String();
		divide(0,str,largest,origin);
		System.out.println(largest.toString());	
		scanner.close();
	}
}