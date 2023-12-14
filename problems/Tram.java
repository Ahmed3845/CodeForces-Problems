/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Tram
 * Problem-Link : https://codeforces.com/problemset/problem/116/A
*/

import java.util.Scanner;

public class Tram{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		int max=0,total=0;
		for(int i=0;i<n;i++){
			String line=scanner.nextLine();
			int a=Integer.parseInt(line.substring(0,line.indexOf(' '))),
			b=Integer.parseInt(line.substring(line.indexOf(' ')+1));
			total-=a;
			max=total>max?total:max;
			total+=b;
			max=total>max?total:max;
		}
		System.out.println(max);
		scanner.close();
	}
}