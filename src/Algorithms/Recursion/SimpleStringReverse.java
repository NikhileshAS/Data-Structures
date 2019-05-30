package Algorithms.Recursion;

public class SimpleStringReverse {

	public static void reverse(String str, int i) {
		if(i == str.length()) {
			return ;
		}
		reverse(str, i+1);
		System.out.println(str.charAt(i));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("Hello", 0);
	}

}