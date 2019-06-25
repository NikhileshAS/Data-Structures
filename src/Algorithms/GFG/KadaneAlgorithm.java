package Algorithms.GFG;

import java.util.Scanner;

public class KadaneAlgorithm {
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	public static int maxSubArray(int[] input) {
		int maximum = input[0];
		int finalMax = input[0];
		for(int i=1; i<input.length; i++) {
			maximum = max(input[i], input[i]+maximum);
			if (maximum > finalMax) finalMax = maximum;
		}
		return finalMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			int size = sc.nextInt();
			int input[] = new int[size];
			for(int j=0; j<size; j++) {
				input[j] = sc.nextInt();
			}
			System.out.println(maxSubArray(input));
		}
		sc.close();
		
	}

}
