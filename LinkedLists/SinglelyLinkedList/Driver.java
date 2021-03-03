package SinglelyLinkedList;

public class Driver {
	
	public static void main(String[] args) {
		SinglelyLinkedList singlelyLinkedList = new SinglelyLinkedList();
		singlelyLinkedList.add(10);
		singlelyLinkedList.add(15);
		singlelyLinkedList.add(20);
		singlelyLinkedList.insertEnd(30);
		singlelyLinkedList.insertFirst(35);
		singlelyLinkedList.deleteFirst();
		singlelyLinkedList.insertPos(3, 29);
		singlelyLinkedList.deleteEnd();
		singlelyLinkedList.deletePos(2);
		singlelyLinkedList.get(1);
		int size = singlelyLinkedList.getSize();
		singlelyLinkedList.printList();
		System.out.println("Size is: " + size + " first element " + singlelyLinkedList.get(1));
	}

}
