package singlyLinkedList;

public class SinglyLinkedListClass {
	static class Node {
		private int data;
		private Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public SinglyLinkedListClass() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	// add first in the list
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	// add last in the list
	public void addLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
//			System.out.println("something");
		}
	}

	// add at position
	public void addAtPosition(int value, int pos) {
		int count = pos;
		Node trav = head;
		while (count != 0) {
			trav = trav.next;
			count--;
		}
		if (trav.next != null) {
			Node newNode = new Node(value);
			Node temp = trav.next;
			trav.next = newNode;
			newNode.next = temp;
//			System.out.println("Here in at position if statement");
		} else if (trav.next == null) {
//			System.out.println("Here in addlast");
			addLast(value);
		}
	}
	
	//reverse a linked list
	public void reverseLinkedList() {
		Node curr = head;
		Node prevNode = null;
		Node nextNode = null;
		while(curr != null) {
			nextNode = curr.next;
			curr.next = prevNode;
			prevNode = curr;
			curr = nextNode;
		}
		head = prevNode;
	}

	// display all list
	public void displayAll() {
		Node trav = head;
		if (isEmpty())
			return;
//		else if (trav.next == null) {
//			System.out.println(trav.data);
//		}
		else {
			while (trav != null) {
				System.out.println(trav.data + " ");
				trav = trav.next;
			}
		}
	}
}
