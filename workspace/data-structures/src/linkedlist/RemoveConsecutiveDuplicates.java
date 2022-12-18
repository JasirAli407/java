package linkedlist;

public class RemoveConsecutiveDuplicates {

	//	        MY CODE
	//	public static Node<Integer> removeDuplicates(Node<Integer> head) {
	//
	//		if (head == null) {
	//			return head;
	//		}
	//
	//		Node temp1 = head;
	//		Node temp2 = head;
	//
	//		while (temp1 != null) {
	//
	//			if (!temp1.data.equals(temp2.data)) {
	//				temp2.next = temp1;
	//				temp2 = temp2.next;
	//			}
	//
	//			temp1 = temp1.next;
	//
	//			if (temp1 == null) {
	//				temp2.next = null;
	//			}
	//
	//		}
	//
	//		return head;
	//
	//	}

	//	        BEST CODE FROM SOLN
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		if (head == null) {
			return head;
		}

		Node<Integer> currHead = head;

		while (currHead.next != null) {

			if (currHead.data.equals(currHead.next.data)) {
				currHead.next = currHead.next.next;
			} else {
				currHead = currHead.next;
			}
		}

		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
