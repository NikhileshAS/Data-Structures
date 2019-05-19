package Stack;

public class FiniteStack {
	
	static int[] finiteStack;
	static int size;
	static int top = -1;
	
	static void createStack(int size) {
		FiniteStack.size = size;
		finiteStack = new int[size];
	}
	
	static boolean isFull() {
		return top == size-1;
	}
	
	static boolean isEmpty() {
		return top == -1;
	}
	
	public static int push(int data) {
		if(!isFull()) {
			top++;
			finiteStack[top] = data;
			return data;
		}
		return -1;
	}
	
	public static int pop() {
		if (isEmpty()) {
			return -1;
		}
		top--;
		return finiteStack[top+1];
	}

}
