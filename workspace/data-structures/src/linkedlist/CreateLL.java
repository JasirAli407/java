package linkedlist;

public class CreateLL {
	public static Node<Integer> createLinkedList() {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(-1);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		return n1;

	}

	public static void main(String[] args) {

	}

}
