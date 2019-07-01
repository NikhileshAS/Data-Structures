package Algorithms.GFG;

public class MissingBits {

	public static int flipBits(int bits) {
		int count = 0;
		while(bits != 0) { 
			System.out.println("bits --> "+ bits);
			count += bits & 1; //counting the bits with 1. 
			bits >>= 1;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println(flipBits(a^b)); //XOR sets 1 to the result bit at the position where the bits of a and b differ. 0010 ^ 0100 = 0110
	}

}
