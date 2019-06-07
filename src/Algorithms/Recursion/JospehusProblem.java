package Algorithms.Recursion;

public class JospehusProblem {

	public static int josephus(int n, int k) {
		if(n==1) return 1;
		return ((josephus(n-1, k)+k-1)%n+1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(josephus(5, 2));
//		StackTraceElement[] stack = Thread.currentThread().getStackTrace();
//		for(int i=0; i<stack.length; i++) System.out.println(stack[i]);

	}

}
