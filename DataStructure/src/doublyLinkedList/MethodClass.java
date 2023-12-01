package doublyLinkedList;

public class MethodClass {
	static class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node() {
			this.data = 0;
			next = null;
			prev = null;
		}

		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}

	private Node head;

	public MethodClass() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
//		System.out.println("Add First");
		Node newNode = new Node(value);
		if (isEmpty()) {
//			System.out.println("add first if");
			head = newNode;
			newNode.next = newNode;
			newNode.prev = newNode;
		} else {
//			System.out.println("add first else");
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			newNode.next = newNode;
			newNode.prev = newNode;
		} else {
			Node trav = head;
			while (trav.next != head) {
				trav = trav.next;
			}
			newNode.next = head;
			head.prev = newNode;
			newNode.prev = trav;
			trav.next = newNode;
			trav = null;
		}

	}

	public void deleteFirst() {
		if (isEmpty()) {
			return;
		} else if (head.next == head.prev) {
			head = null;
		} else {
			head.next.prev = head.prev;
			head.prev.next = head.next;
			head = head.next;
		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			return;
		} else if (head.next == head.prev) {
			head = null;
		} else {
			head.prev = head.prev.prev;
			head.prev.next = head;
		}
	}

	public void addAtPosistion(int value, int position) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			newNode.next = newNode;
			newNode.prev = newNode;
		} else {
			Node trav = head;
			for (int i = 1; i < position; i++) {
				trav = trav.next;
			}
			newNode.prev = trav;
			newNode.next = trav.next;
			trav.next.prev = newNode;
			trav.next = newNode;
			trav = null;
		}
	}

	public void displayAll() {
		if (isEmpty()) {
			return;
		} else {
			Node trav = head;
//			while (trav.next != head.prev) {
//				System.out.print(trav.data + " ");
//				trav = trav.next;
//			}
			do {
				System.out.print(trav.data + " ");
				trav = trav.next;
			} while (trav != head);
			trav = null;
		}
	}

}
