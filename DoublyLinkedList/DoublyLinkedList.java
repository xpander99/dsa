package DoublyLinkedList;

public class DoublyLinkedList {
	
	class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node head;
	private Node temp;
	private int size;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			temp = head;
		}else {
			temp.next = newNode;
			newNode.prev = temp;
			temp = newNode;
		}
		size++;
	}
	
	public void insertBeg(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node newNode = new Node(data);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
		size++;
	}
	//insertion done in O(1)
	public void insertEnd(int data) {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		Node newNode = new Node(data);
		temp.next = newNode;
		newNode.prev = temp;
		temp = newNode;
		size++;
	}
	
	public void insertAtPos(int pos, int data) {
		if(pos < 1 || pos > size) {
			System.out.println("Invalid position");
			return;
		}else if(pos == 1) {
			insertBeg(data);
		}
		Node curr = head;
		int i = 1;
		while(i < pos - 1) {
			curr = curr.next;
			i++;
		}
		Node next = curr.next;
		Node newNode = new Node(data);
		curr.next = newNode;
		newNode.prev = curr;
		newNode.next = next;
		next.prev = newNode;
	}
	public void insertAfterPos(int pos, int data) {
		if(pos < 1 || pos > size) {
			System.out.println("Invalid position");
			return;
		}else if(pos == 1) {
			insertBeg(data);
		}
		Node curr = head;
		int i = 1;
		while(i < pos) {
			curr = curr.next;
			i++;
		}
		Node next = curr.next;
		Node newNode = new Node(data);
		curr.next = newNode;
		newNode.prev = curr;
		newNode.next = next;
		next.prev = newNode;
	}
	public int size() {
		return this.size;
	}
	public void deleteBeg() {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		head = head.next;
		head.prev = null;
	}
	public void deleteEnd() {
		temp = temp.prev;
		temp.next = null;
	}
	public void deletePos(int pos) {
		if(pos > size) {
			System.out.println("Wrong index");
			return;
		}
		if(pos == 1) {
			deleteBeg();
			return;
		}
		if(pos == size) {
			deleteEnd();
			return;
		}
		int i = 1;
		Node temp = head;
		while(i < pos - 1) {
			temp = temp.next;
			i++;
		}
		Node prevNode = temp;
		Node nextNode = temp.next.next;
		temp.next = nextNode;
		nextNode.prev = prevNode;
	}
	public void printList() {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		Node curr = head;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	

}
