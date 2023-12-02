/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Lucky Ticket
 * Problem-Link : https://codeforces.com/problemset/problem/146/A
*/

import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class LuckyTicket{
	public static BigInteger TEN=new BigInteger("10");
	public static int sum(BigInteger number){
		int sum=0;
		while(!number.equals(BigInteger.ZERO)){
			sum+=number.mod(TEN).intValue();
			number=number.divide(BigInteger.valueOf(10));
		}
		return sum;	
	}
	public static boolean isLucky(BigInteger number){
		while(!number.equals(BigInteger.ZERO)){
			if(number.mod(TEN).intValue()!=4&&number.mod(TEN).intValue()!=7){
				return false;
			}
			number=number.divide(TEN);
		}
		return true;
	}

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		String lineInp=scanner.nextLine();
		BigInteger number=new BigInteger(lineInp);
		System.out.println(lineInp.charAt(0)!='0'&&sum(number.mod(BigDecimal.valueOf(Math.pow(10,n/2)).toBigInteger()))
			==sum(number.divide(BigDecimal.valueOf(Math.pow(10,n/2)).toBigInteger()))
			&&isLucky(number)?"YES":"NO");

		scanner.close();
	}
}