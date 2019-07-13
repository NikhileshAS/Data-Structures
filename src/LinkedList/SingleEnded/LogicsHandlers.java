package LinkedList.SingleEnded;

import java.util.Scanner;

public class LogicsHandlers {
	int length = 0;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node head, pointer, tail;
	public void detectLoop(LogicsHandlers list) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LogicsHandlers list = new LogicsHandlers();
		
		while(sc.hasNextInt()) {
			int data = sc.nextInt();
			Node node = new Node(data);
			if(list.length == 0) {
				list.head = node;
				list.pointer = list.head;
			}
			else {
				list.pointer.next = node;
				list.pointer = node;
			}
			list.length++;
			list.tail = list.pointer;
			list.pointer = list.head;
		}
		sc.close();
		list.detectLoop(list);
	}

}
