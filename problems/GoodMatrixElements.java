/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A1. Good Matrix Elements
 * Problem-Link : https://codeforces.com/problemset/problem/177/A1
*/

import java.util.Scanner;

public class GoodMatrixElements{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		int h=0,k=0,total=0,toDelete=0,element;
		for(int i=0;i<n;i++){
			h=0;
			k=0;
			String str=scanner.nextLine();
			for(int j=0;j<str.length();j++){
				if(str.charAt(j)==' ' || j==str.length()-1){
					element=str.charAt(j)==' '?Integer.parseInt(str.substring(k,j)):Integer.parseInt(str.substring(k));
					total+=element;
					toDelete+=(i!=(n-1)/2 && h!=(n-1)/2 && h!=i && h!=n-i-1)?element:0;
					k=j+1;
					h++;
				}
			}
		}
		System.out.println(total-toDelete);
		scanner.close();
	}
}