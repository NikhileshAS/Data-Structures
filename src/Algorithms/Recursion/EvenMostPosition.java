package Algorithms.Recursion;

import java.util.Scanner;

//Some people are standing in a queue.
//A selection process follows a rule where people standing on even positions are selected.
//Of the selected people a queue is formed and again out of these only people on even position are selected. 
//This continues until we are left with one person. Find out the position of that person in the original queue.

public class EvenMostPosition {

	public void findPosition(int array[]) {
		if(array.length == 1) {
			System.out.println(array[0]);
			return;
		}
		int newArray[] = new int[array.length/2];
		int k=0;
		for(int i=0; i<array.length; i++) {
			if(i%2 != 0) {
				newArray[k]=array[i];
				k++;
			}
		}
		findPosition(newArray);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			int input = sc.nextInt();
			int inpArray[] = new int[input];
			for(int j=1; j<=input; j++) {
				inpArray[j-1] = j;
			}
			new EvenMostPosition().findPosition(inpArray);
		}
	}

}
