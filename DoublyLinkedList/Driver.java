package DoublyLinkedList;

public class Driver {
	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add(10);
		doublyLinkedList.add(15);
		doublyLinkedList.add(20);
		doublyLinkedList.deletePos(1);
		doublyLinkedList.printList();		
	}

}
