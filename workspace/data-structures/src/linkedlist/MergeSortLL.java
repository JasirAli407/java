package linkedlist;

public class MergeSortLL {
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {

		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}

		Node<Integer> tail, head, temp1 = head1, temp2 = head2;

		if (temp1.data <= temp2.data) {
			head = head1;
			temp1 = temp1.next;
		} else {
			head = head2;
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

	public static Node<Integer> mergeSort(Node<Integer> head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node<Integer> fast = head;
		Node<Integer> slow = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		Node<Integer> head2 = slow.next;
		slow.next = null;

		Node<Integer> smallLL1 = mergeSort(head);
		Node<Integer> smallLL2 = mergeSort(head2);

		return merge(smallLL1, smallLL2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
