package LinkedList.SingleEnded;

import java.util.Scanner;


public class InsertionAndTraversal {

	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	Node head, pointer, tail;
	int length = 0;
	
	public void printList(InsertionAndTraversal linkedList) {
		while(linkedList.pointer.next != null) {
			System.out.print(linkedList.pointer.data + " ");
			linkedList.pointer = linkedList.pointer.next;
		}
		System.out.println(linkedList.tail.data);
		linkedList.pointer = linkedList.head;
	}
	public void insertAtPosition(InsertionAndTraversal linkedList, int position, int number) {
		int length = 0;
		while(position-2 != length) {
			linkedList.pointer = linkedList.pointer.next;
			length++;
		}
		Node newNode = new Node(number);
		Node continuationNode = linkedList.pointer.next;
		linkedList.pointer.next = newNode;
		newNode.next = continuationNode;
		linkedList.pointer = linkedList.head;
		while(linkedList.pointer != null) {
			System.out.print(linkedList.pointer.data + " ");
			linkedList.pointer = linkedList.pointer.next;
		}
		System.out.println();
		linkedList.pointer = linkedList.head;
	}
	public void deleteAtPosition(InsertionAndTraversal list, int position) {
		int length = 0;
		while(position-2 != length) {
			list.pointer = list.pointer.next;
			length++;
		}
		list.pointer.next = list.pointer.next.next;
		list.pointer = list.head;
		while(list.pointer != null) {
			System.out.print(list.pointer.data + " ");
			list.pointer = list.pointer.next;
		}
		list.pointer = list.head;
		System.out.println();
	}
	public void printReverseList(InsertionAndTraversal linkedList) {
		Node prev, next;
		linkedList.pointer = linkedList.pointer.next;
		linkedList.head.next = null;
		prev = linkedList.head;
		next = linkedList.pointer.next;
		while(next != null) {
			linkedList.pointer.next = prev;
			prev = linkedList.pointer;
			linkedList.pointer = next;			
			next = linkedList.pointer.next;
		}
		linkedList.pointer.next = prev;
		while(linkedList.pointer != null) {
			System.out.print(linkedList.pointer.data + " ");
			linkedList.pointer = linkedList.pointer.next;
		}
		linkedList.pointer = head;
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionAndTraversal linkedList = new InsertionAndTraversal();
		Scanner sc = new Scanner(System.in);
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
		linkedList.pointer = linkedList.head;
		sc.close();
		linkedList.printList(linkedList);
		linkedList.insertAtPosition(linkedList, 2, 6);
		linkedList.deleteAtPosition(linkedList, 2);
		linkedList.printReverseList(linkedList);
	}

}
