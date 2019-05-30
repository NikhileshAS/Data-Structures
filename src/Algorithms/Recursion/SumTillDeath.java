package Algorithms.Recursion;

public class SumTillDeath {

	public int sumTillDeath(int x,int y) {
		if(x == 0)return y;
		return sumTillDeath(x-1, x+y);
	}
	public static void main(String args[]) {
		System.out.println(new SumTillDeath().sumTillDeath(5, 2));
	}
}
