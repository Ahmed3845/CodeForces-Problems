/* 
 * Author 	: Ahmed Sellami
 * Problem-Name : A. Amusing Joke
 * Problem-Link : https://codeforces.com/problemset/problem/141/A
*/

import java.util.Scanner;
import java.util.HashMap;

public class AmusingJoke{
	public static void fillChars(String line,HashMap<Character,Integer> chars){
		for(int i=0;i<line.length();i++){
			chars.put(line.charAt(i),chars.containsKey(line.charAt(i))?chars.get(line.charAt(i))+1:1);
		}
	}

	public static boolean checkChars(HashMap<Character,Integer> names, HashMap<Character,Integer> pile){
		if(names.size()!=pile.size())
			return false;
		for(char c: names.keySet()){
			if(!pile.containsKey(c)||names.get(c)!=pile.get(c))
				return false;
		}
		return true;
	}

	public static boolean permuted(String line1,String line2,String line3){
		if(line1.length()+line2.length()==line3.length()){
			HashMap<Character,Integer> names=new HashMap<>(), pile=new HashMap<>();
			fillChars(line1+line2,names);
			fillChars(line3,pile);
			if(checkChars(names,pile))
				return true;
		}
		return false;
	}

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String line1=scanner.nextLine(),line2=scanner.nextLine(),line3=scanner.nextLine();
		System.out.println(permuted(line1,line2,line3)?"YES":"NO");
		scanner.close();
	}
}