package linkedlist;

public class MergeTwoSortedLL {
	public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {

		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}

		Node<Integer> head = null, tail, temp1 = head1, temp2 = head2;

		if (temp1.data <= temp2.data) {
			head = temp1;
			temp1 = temp1.next;
		} else {
			head = temp2;
			temp2 = temp2.next;
		}

		tail = head;

		while (temp1 != null && temp2 != null) {

			if (temp1.data <= temp2.data) {
				tail.next = temp1;
				tail = temp1;
				temp1 = temp1.next;
			}

			else {
				tail.next = temp2;
				tail = temp2;
				temp2 = temp2.next;
			}
		}

		if (temp1 != null) {
			tail.next = temp1;

		}

		else if (temp2 != null) {
			tail.next = temp2;

		}

		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
