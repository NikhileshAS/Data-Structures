package Algorithms.Sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i=0; i<size; i++) input[i] = sc.nextInt();
		
//		Insertion sort: Iterates the array and for each element place it to the correct position in the array.
//		This is like cards game.
		
		// For each index to check the correct position that it fits into.
		
		for(int i=1; i<size; i++) { 
			int temp = input[i];
			
			// Iterate reverse to get the correct position and swap one by one.
		
			for(int j=i-1; j >= 0; j--) {
				if(temp < input[j]) {
					input[j+1] = input[j];
					input[j] = temp;
				}
			}
		}
		for(int i=0; i<size; i++) System.out.print(input[i]+" ");
		

	}

}
