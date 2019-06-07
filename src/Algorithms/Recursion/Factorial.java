package Algorithms.Recursion;

public class Factorial {

	public int factorial(int i) {
		if (i < 0) return -1;
		if(i == 1 || i == 0) return 1;
		return i*factorial(i-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = new Factorial().factorial(0);
		if (ans == -1 ) System.out.println("Not a valid factorial found");
		else System.out.println(ans);

	}

}
