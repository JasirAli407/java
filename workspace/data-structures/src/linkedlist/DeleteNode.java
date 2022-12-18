package linkedlist;

public class DeleteNode {

	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		if (head == null) {
			return head;
		}
		if (pos == 0) {
			return head.next;
		}
		int count = 0;
		Node<Integer> curr = head;

		while (count < pos - 1 && curr != null) {
			curr = curr.next;
			count++;
		}
		if (curr == null || curr.next == null) {

			return head;
		}
		curr.next = curr.next.next;

		return head;

	}

	//	MY CODE
	//	public static Node<Integer> delete(Node<Integer> head, int pos) {
	//
	//		int count = 0;
	//		Node<Integer> prev = head;
	//
	//		while (prev != null) {
	//			if (pos == 0) {
	//				head = head.next;
	//				return head;
	//			} else if (pos - 1 == count) {
	//				if (prev.next == null) {
	//					return head;
	//				} else {
	//					prev.next = prev.next.next;
	//				}
	//
	//			}
	//			count++;
	//			prev = prev.next;
	//		}
	//		return head;
	//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
