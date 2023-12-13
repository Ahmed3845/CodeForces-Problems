/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Arrival of the General
 * Problem-Link : https://codeforces.com/problemset/problem/144/A
*/

import java.util.Scanner;

public class ArrivalGeneral{
	public static int[][] getMinMax(int[] heights,int n){
		int[][] result=new int[2][2];
		result[0][0]=heights[0];
		result[0][1]=0;
		result[1][0]=heights[0];
		result[1][1]=0;
		for(int i=0;i<n;i++){
			if(heights[i]<result[0][0]){
				result[0][0]=heights[i];
				result[0][1]=i;
			}else if(heights[i]==result[0][0]&&i>result[0][1]){
				result[0][1]=i;
			}else if(heights[i]>result[1][0]){
				result[1][0]=heights[i];
				result[1][1]=i;
			}else if(heights[i]==result[1][0]&&i<result[0][1]){
				result[1][1]=i;
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] heights=new int[n];
		scanner.nextLine();
		String values=scanner.nextLine();
		int k=0,h=0;
		for(int i=0;i<values.length();i++){
			if(values.charAt(i)==' '||i==values.length()-1){
				heights[k]=values.charAt(i)==' '?Integer.parseInt(values.substring(h,i)):Integer.parseInt(values.substring(h));
				k++;
				h=i+1;
			}
		}
		int[][] min_max=getMinMax(heights,n);
		System.out.println(min_max[0][1]>min_max[1][1]?min_max[1][1]+n-min_max[0][1]-1:min_max[1][1]+n-min_max[0][1]-2);
		scanner.close();
	}
}