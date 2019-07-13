package LinkedList.SingleEnded;

public class Basics {

	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	Node head;
	Node pointer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basics linkedList = new Basics();
		linkedList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		linkedList.head.next = second;
		second.next = third;
		linkedList.pointer = linkedList.head;
		while(linkedList.pointer.next != null) {
			System.out.println(linkedList.pointer.data);
			linkedList.pointer = linkedList.pointer.next;
		}
		System.out.println(linkedList.pointer.data);
		
	}

}
