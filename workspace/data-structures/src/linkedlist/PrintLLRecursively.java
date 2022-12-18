package linkedlist;

public class PrintLLRecursively {
	public static void printLLRecursive(Node<Integer> head) {

		if (head == null) {
			return;
		}

		System.out.print(head.data + " ");
		printLLRecursive(head.next);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
