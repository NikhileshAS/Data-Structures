package Queue;

public class Queue {
	
	static int MyQueue[];
	static int size;
	static int rear = -1;
	static int front = rear+1;
	
	static void createQueue(int size) {
		Queue.size = size;
		MyQueue = new int[size];
	}
	
	static boolean isFull() {
		return front == size;
	}
	
	static boolean isEmpty() {
		return rear+1 == front;
	}
	static void enqueue(int data) {
		if(!isFull()) {
			MyQueue[front] = data;
			front++;
		}
	}
	static void dequeue() {
		if(!isEmpty()) {
			MyQueue[rear] = 0;
			rear++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
