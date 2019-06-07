package Algorithms.Recursion;

public class IntegerPalindrome {

	public static boolean isArrayPalindrome(int array[], int start, int end) {
		if(start >= end) return array[start] == array[end];
		if(array[start] != array[end]) return false;
		return isArrayPalindrome(array, ++start, --end);
	}
	public boolean isDigitPalindrome(int digit) {
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,4,2,1};
		System.out.println(isArrayPalindrome(array, 0, array.length-1));
	}

}
