package Stack.Problems;

import java.util.Stack;

public class StackReverseRecursion {

	public static void insert(Stack<Integer> stack, int x) {
		if(stack.isEmpty()) stack.push(x);
		else {			
			int y = stack.pop();
			insert(stack, x);
			stack.push(y);
		}
	}
	public static void reverse(Stack<Integer> stack){
		if(stack.isEmpty()) return;
		int x = stack.pop();
		reverse(stack);
		insert(stack, x);
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		System.out.println(stack);
		reverse(stack);
		System.out.println(stack);
		
	}

}
