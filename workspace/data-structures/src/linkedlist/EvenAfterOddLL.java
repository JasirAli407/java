package linkedlist;

public class EvenAfterOddLL {
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {

		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> t1 = head, oddHead = null, evenHead = null, oddTail = null, evenTail = null;

		while (t1 != null) {
			if (t1.data % 2 != 0) {
				if (oddHead == null) {
					oddHead = t1;
					oddTail = oddHead;
				} else {
					oddTail.next = t1;
					oddTail = oddTail.next;
				}
			} else {
				if (evenHead == null) {
					evenHead = t1;
					evenTail = evenHead;
				}

				else {
					evenTail.next = t1;
					evenTail = evenTail.next;
				}
			}
			t1 = t1.next;
		}

		if (oddHead == null) {
			return evenHead;
		} else {
			oddTail.next = evenHead;
		}
		if (evenHead != null) {
			evenTail.next = null;
		}

		return oddHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
