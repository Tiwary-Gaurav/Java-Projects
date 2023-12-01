package singlyLinkedList;

public class SinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedListClass list = new SinglyLinkedListClass();
		list.addFirst(12);
		list.addFirst(15);
		list.addLast(24);
		list.addAtPosition(9, 2);
		list.displayAll();
	}

}
