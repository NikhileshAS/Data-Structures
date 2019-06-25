package Algorithms.Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i=0; i<size; i++) input[i] = sc.nextInt();
		
//		SelectionSort: Selects the smallest number from the array and place it at the beginning,
//		Select the second smallest and place at the second index.
//		Hint: Keep the array to the left of the index to be always sorted and to the right remains unsorted
		
		for(int i=0; i<size; i++) {
			int min = input[i];
			int index = 0;
			for(int j=i+1; j<size; j++) {
				if(input[j] < min) {
					min = input[j];
					index = j;
				}
			}
			if(min != input[i] && index !=0) {
				input[index] = input[i];
				input[i] = min;
			}
		}
		for(int i=0; i<size; i++) System.out.print(input[i]+" ");
	}

}
