package SinglelyLinkedList;

public class SinglelyLinkedList {
	
	class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node head;
	private Node temp;
	private int size;
	
	public int getSize() {
		return this.size;
	}
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			temp = head;
		}else {
			temp.next = newNode;
			temp = newNode;
		}
		size++;
	}
	public int get(int i) {
		if(i > size) {
			System.out.println("Outbound");
			return -1;
		}
		Node curr = head;
		while(i > 1) {
			curr = curr.next;
			i--;
		}
		return curr.data;
	}
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	public void insertEnd(int data) {
		if(head == null) {
			System.out.println("Empty list");
		}else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			Node newNode = new Node(data);
			curr.next = newNode;
			size++;
		}
	}
	public void insertPos(int pos, int data) {
		if(pos > size) {
			System.out.println("Wrong position");
		}
		Node curr = head;
		int i = 1;
		while(i < pos - 1) {
			curr = curr.next;
			i++;
		}
		Node newNode = new Node(data);
		Node temp = curr.next;
		curr.next = newNode;
		newNode.next = temp;
		size++;
		
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("Nothing to delete");
			return;
		}else if(size == 1) {
			head = null;
		}else {
			head = head.next;
		}
		size--;
	}
	public void deleteEnd() {
		if(head == null) {
			System.out.println("Nothing to delete");
			return;
		}else if(size == 1) {
			head = null;
		}else {
			Node curr = head;
			Node prevNode = head;
			while(curr.next != null) {
				curr = curr.next;
				if(curr.next != null) {
					prevNode = prevNode.next;
				}
			}
			prevNode.next = null;
			size--;
			
		}
	}
	public void deletePos(int pos) {
		if(pos >= size) {
			System.out.println("Outbound");
			return;
		}else if(pos == 1) {
			head = null;
		}else {
			Node curr = head;
			int i = 1;
			while(i < pos - 1) {
				curr = curr.next;
				i++;
			}
			Node nextNode = curr.next;
			curr.next = nextNode.next;
			size--;
		}
	}
	public void printList() {
		Node curr = head;
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
	
}
