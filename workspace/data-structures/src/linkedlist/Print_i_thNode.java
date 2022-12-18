package linkedlist;

public class Print_i_thNode {
	public static void printIthNode(Node<Integer> head, int i) {

		Node<Integer> temp = head;
		int count = 0;
		while (temp != null) {

			if (i == count) {
				System.out.println(temp.data);

			}
			count++;
			temp = temp.next;
		}

	}

	public static void main(String[] args) {

	}

}
