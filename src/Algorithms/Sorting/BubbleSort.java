package Algorithms.Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i=0; i<size; i++) input[i] = sc.nextInt();

//		Bubble Sort : Iterates comparing the current index element with next index element. 
//		This iteration continues for 'n'times, where n = Size of the array.
//		Each index iterates from the first, until it reaches the last's index
//      TC: O(n^2)

		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-1; j++) {
				if(input[j] > input[j+1]) {
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<size; i++) System.out.print(input[i]+" ");
	}

}
