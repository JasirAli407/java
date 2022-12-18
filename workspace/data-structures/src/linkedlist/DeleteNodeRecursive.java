package linkedlist;

public class DeleteNodeRecursive {
	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {

		if (head == null) {
			return head;
		}
		if (pos == 0) {
			return head = head.next;

		}

		else {
			head.next = deleteNodeRec(head.next, pos - 1);
			return head;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
