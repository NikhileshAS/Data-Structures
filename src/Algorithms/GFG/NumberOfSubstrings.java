package Algorithms.GFG;

import java.util.Scanner;

public class NumberOfSubstrings {

	public static int substrings(String input) {
		int m = 0;
		for(char i:input.toCharArray()) if(i == '1') ++m; 
		return (m*(m-1))/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			String input = sc.next();
			System.out.println(NumberOfSubstrings.substrings(input));
		}
		sc.close();

	}

}
