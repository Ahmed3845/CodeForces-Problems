/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Remove Smallest
 * Problem-Link : https://codeforces.com/problemset/problem/1399/A
*/

import java.util.Scanner;
import java.util.Arrays;

public class RemoveSmallest{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		int[] elements;
		int h=0,index=0,n,length;
		String test_cases;
		for(int i=0;i<t;i++){
			h=0;
			index=0;
			n=scanner.nextInt();
			scanner.nextLine();
			test_cases=scanner.nextLine();
			elements=new int[n];
			for(int k=0;k<test_cases.length();k++){
				if(test_cases.charAt(k)==' ' || k==test_cases.length()-1){
					elements[index]=test_cases.charAt(k)==' '?Integer.parseInt(test_cases.substring(h,k)):Integer.parseInt(test_cases.substring(h));
					h=k+1;
					index++;
				}
			}
			Arrays.sort(elements);
			length=n;
			for(int j=0;j<n-1;j++){
				length-=Math.abs(elements[j]-elements[j+1])<=1?1:0;
			}
			System.out.println(length==1?"YES":"NO");
		}
		scanner.close();
	}
}