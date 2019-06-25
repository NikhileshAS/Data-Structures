package Algorithms.GFG;
import java.util.Scanner;

public class MissingNumber {
	public static int missingNumber(int input[], int size){
        int xor=0;
        int value=0;
		for(int i=0; i<size; i++) xor ^= i;
		for(int i=0; i<size; i++) value ^=input[i];
		
        return xor^value;
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int size = sc.nextInt();
		    int input[] = new int[size];
		    for(int j=0; j<size; j++){
		        input[j] = sc.nextInt();
		    }
		    System.out.println(missingNumber(input, size));
		}
	}
}
