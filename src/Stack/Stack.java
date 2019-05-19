package Stack;

import java.util.ArrayList;

public class Stack {
	static ArrayList<Integer> myStack = new ArrayList<Integer>();
	public static ArrayList<Integer> getMyStack() {
		return myStack;
	}
	public static void push(int data) {
		myStack.add(data);
	}
	public static boolean isEmpty() {
		return myStack.size() == 0;
	}
	
	public static int pop() {
		if (!isEmpty()){
			return myStack.get(myStack.size()-1);
		}
		return 0;
	}
	public static int peek() {
		return myStack.get(myStack.size()-1);
	}
	public class Operations{
		 int middleData() {
			return myStack.get(myStack.size()/2);
		}
	}
	
	
	public static void main(String args[]) {
		push(5);
		push(7);
		push(9);
		System.out.println(pop());
		Stack.Operations op = new Stack().new Operations(); //Learning nested classes.
		System.out.println(op.middleData());
	}
}

