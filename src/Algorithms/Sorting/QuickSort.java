package Algorithms.Sorting;

import java.util.Scanner;

public class QuickSort {
	
	// Quick Sort. Uses divide and conquer technique. Takes last index as pivot and places in it's correct position.
	// Maintains such that elements to the left of the index are smaller to the pivot  and
	// elements to the right of the index are greater than the pivot
	
	public static int partition(int input[], int lower, int higher) {
		int i = lower-1;
		for(int j=lower; j<higher; j++) {
			if(input[j] <= input[higher]) {
				i++;
				int temp = input[j];
				input[j] = input[i];
				input[i] = temp;				
			}
		}
		int temp = input[i+1];
		input[i+1] = input[higher];
		input[higher] = temp;
		return i+1;
	}
	
	public static void sort(int input[], int lower, int higher) {
		if(lower < higher) {
			int pi = partition(input, lower, higher);
			sort(input, lower, pi-1);
			sort(input, pi+1, higher);
		}
		return;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i=0; i<size; i++) input[i] = sc.nextInt();
		QuickSort.sort(input, 0, size-1);
		for(int i=0; i<size; i++) System.out.print(input[i]+" ");
	}

}
