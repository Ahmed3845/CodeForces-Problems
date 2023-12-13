/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Presents
 * Problem-Link : https://codeforces.com/problemset/problem/136/A
*/

import java.util.Scanner;

public class Presents{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] order=new int[n];	
		scanner.nextLine();
		String line=scanner.nextLine();
		int k=0,h=0;
		for(int i=0;i<line.length();i++){
			if(line.charAt(i)==' '||i==line.length()-1){
				order[i!=line.length()-1?Integer.parseInt(line.substring(h,i))-1:Integer.parseInt(line.substring(h))-1]=k+1;
				h=i+1;
				k++;
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(i==n-1?order[i]+"\n":order[i]+" ");
		scanner.close();
	}
}