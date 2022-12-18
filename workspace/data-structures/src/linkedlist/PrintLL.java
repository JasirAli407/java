package linkedlist;

public class PrintLL {
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

	}

}
