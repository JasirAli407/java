package linkedlist;

public class DeleteEveryNnodesAfterMnodes {
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		if (head == null || M == 0) {
			return null;
		}
		if (N == 0) {
			return head;
		}

		Node<Integer> currNode = head, temp = null;
		int take;
		int skip;
		while (currNode != null) {
			take = 0;
			skip = 0;
			while (currNode != null && take < M) {
				if (temp == null) {
					temp = currNode;
				} else {
					temp.next = currNode;
					temp = currNode;
				}
				currNode = currNode.next;
				take++;
			}

			while (currNode != null && skip < N) {
				currNode = currNode.next;
				skip++;
			}
		}
		if (temp != null) {
			temp.next = null;
		}

		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
