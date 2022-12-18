package linkedlist;

public class InsertAt_i_th {
	public static Node<Integer> insert(Node<Integer> head, int pos, int data) {

		Node<Integer> nodeToBeInserted = new Node<>(data);
		if (pos == 0) {
			nodeToBeInserted.next = head;
			return nodeToBeInserted;
		} else {
			Node<Integer> prev = head;
			int count = 0;
			while (count < pos - 1 && prev != null) {
				prev = prev.next;
				count++;
			}
			if (prev != null) {
				nodeToBeInserted.next = prev.next;
				prev.next = nodeToBeInserted;
			}
			return head;
		}

	}

	//	  MY CODE
	//	public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
	//
	//		int count = 0;
	//		Node<Integer> prev = head;
	//		Node<Integer> newNode = new Node<Integer>(data);
	//
	//		while (prev != null) {
	//			if (pos == 0) {
	//				head = newNode;
	//				head.next = prev;
	//				break;
	//			} else if (pos - 1 == count) {
	//				newNode.next = prev.next;  // make before break
	//				prev.next = newNode;
	//				break;
	//			}
	//			count++;
	//			prev= prev.next;
	//		}
	//		return head;
	//
	//	}

	public static void main(String[] args) {

	}

}
