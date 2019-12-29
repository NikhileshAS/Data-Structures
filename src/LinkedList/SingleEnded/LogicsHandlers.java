package LinkedList.SingleEnded;

import java.util.Scanner;

import LinkedList.SingleEnded.InsertionAndTraversal.Node;

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
		Node fastP = list.head, slowP = list.pointer;
		boolean flag = false;
		int length= 1;
		while(slowP != null && fastP != null && fastP.next != null) {
			slowP = slowP.next;
			fastP = fastP.next.next;
			if(slowP == fastP) {
				flag = true;
				
				break;
			}
		}
		while(slowP.next != fastP) {
			slowP = slowP.next;
			length++;
		}
		System.out.println("Loop's length is = "+ length);
		if(flag) System.out.println("There's a loop");
		else System.out.println("There's no loop");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LogicsHandlers linkedList = new LogicsHandlers();
		while(sc.hasNextInt()) {
			int data = sc.nextInt();
			Node node = new Node(data);
			if(linkedList.length == 0) {
				linkedList.head = node;
				linkedList.pointer = node;	
			}
			else {
				linkedList.pointer.next = node;
				linkedList.pointer = node;
			}
			linkedList.length++;
		}
		linkedList.tail = linkedList.pointer;
		linkedList.tail.next = linkedList.head.next.next;
		linkedList.pointer = linkedList.head;
		sc.close();
		linkedList.detectLoop(linkedList);
	}

}
