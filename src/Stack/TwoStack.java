package Stack;

public class TwoStack {
	static int[] twoStack;
	static int top1, top2;
	static final String LEFT_STACK = "LEFT_STACK";
	static final String RIGHT_STACK = "RIGHT_STACK";
	
	static void createStack(int size) {
		twoStack = new int[size*2];
		top1 = -1;
		top2 = size*2;
	}
	
	static boolean isEmpty(String stack) {
		if(stack.equals(LEFT_STACK)) return top1 == -1;
		else if (stack.equals(RIGHT_STACK))	 return top2 == twoStack.length; 
		else return false;
	}
	
	static boolean isFull(String stack) {
		if(stack.equals(LEFT_STACK)) return top1 == (twoStack.length/2)-1;
		else if (stack.equals(RIGHT_STACK))	return top2 == (twoStack.length/2); 
		else return false;
	}
	static void push(int data, String stack) {
		if(isFull(stack)) {
			System.out.println("Stack is full");
//			System.exit(0);
		}
		else {
			if(stack.equals(LEFT_STACK)) {
				top1++;
				twoStack[top1] = data;
			}
			else if(stack.equals(RIGHT_STACK)) {
				top2--;
				twoStack[top2] = data;
			}
		}
	}
	static int pop(String stack) {
		if(isEmpty(stack)) {
			System.out.println("Stack is empty");
//			System.exit(0);
		}
		else {
			if(stack.equals(LEFT_STACK)) {
				int data = twoStack[top1];
				twoStack[top1]=0;
				top1--;
				return data;
			}
			else if(stack.equals(RIGHT_STACK)) {
				int data = twoStack[top2];
				twoStack[top2]=0;
				top2++;
				return data;
			}
			return -1;
		}
		return -1;
	}
	
	static void viewStack() {
		for(int i: twoStack) {
			System.out.print(i + " ");
			}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createStack(3);
		push(2, RIGHT_STACK);
		push(2, LEFT_STACK);
		push(10, LEFT_STACK);
		viewStack();
		push(11, LEFT_STACK);
		push(534, RIGHT_STACK);
		pop(LEFT_STACK);
		viewStack();
		push(10, LEFT_STACK);
		push(11, RIGHT_STACK);
		viewStack();
		push(54, RIGHT_STACK);
		pop(LEFT_STACK);
		push(54, LEFT_STACK);
		viewStack();

	}

}
