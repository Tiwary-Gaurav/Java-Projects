package singlyLinkedList;

public class SinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedListClass list = new SinglyLinkedListClass();
		list.addFirst(10);
		list.addFirst(20);
		list.addLast(30);
		list.addAtPosition(40, 2);
		list.displayAll();
		System.out.println("--------------");
		list.reverseLinkedList();
		list.displayAll();
	}

}
