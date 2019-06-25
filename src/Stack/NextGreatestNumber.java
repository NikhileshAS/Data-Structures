package Stack;

import java.util.ArrayList;

public class NextGreatestNumber {
	static ArrayList<Integer> stack = new ArrayList<Integer>();
	static int pointer = -1; 
	public static void push(int number) {
		stack.add(number);
		pointer++;
	}
	public static int pop() {
		if(pointer == -1) return -1;
		pointer -= 1;
		int number = stack.get(pointer+1);
		stack.remove(pointer+1);
		return number;
	}
	public static int peek() {
		return stack.get(pointer);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
