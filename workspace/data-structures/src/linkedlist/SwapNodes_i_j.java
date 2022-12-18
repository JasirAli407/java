package linkedlist;

public class SwapNodes_i_j {
	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		if (head == null || i == j) {
			return head;
		}

		Node<Integer> currNode = head, firstNode = null, secondNode = null, firstPrev = null,
				secondPrev = null, prev = null;
		;
		int pos = 0;
		while (currNode != null) {

			if (pos == i) {
				firstNode = currNode;
				firstPrev = prev;
			} else if (pos == j) {
				secondNode = currNode;
				secondPrev = prev;
			}

			prev = currNode;
			currNode = currNode.next;
			pos++;
		}

		if (firstPrev != null) {
			firstPrev.next = secondNode;
		} else {
			head = secondNode;
		}

		if (secondPrev != null) {
			secondPrev.next = firstNode;
		} else {
			head = firstNode;
		}
		Node<Integer> temp = firstNode.next;
		firstNode.next = secondNode.next;
		secondNode.next = temp;

		return head;

	}

	public static void main(String[] args) {

	}

}
