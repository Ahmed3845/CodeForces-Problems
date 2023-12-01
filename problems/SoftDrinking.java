/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Soft Drinking
 * Problem-Link : https://codeforces.com/problemset/problem/151/A
*/

import java.util.Scanner;

public class SoftDrinking{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int[] components=new int[8];
		int h=0,index=0;
		String line=scanner.nextLine();
		for(int k=0;k<line.length();k++){
			if(line.charAt(k)==' ' || k==line.length()-1){
				components[index]=line.charAt(k)==' '?Integer.parseInt(line.substring(h,k)):Integer.parseInt(line.substring(h));
				h=k+1;
				index++;
			}
		}
		int toasts1=(components[1]*components[2])/components[6];
		int toasts2=components[3]*components[4];
		int toasts3=components[5]/components[7];
		int result=toasts1<=toasts2&&toasts1<=toasts3?toasts1/components[0]:toasts2<=toasts1&&toasts2<=toasts3?toasts2/components[0]:
		toasts3<=toasts1&&toasts3<=toasts2?toasts3/components[0]:-1;
		System.out.println(result);
		scanner.close();
	}
}