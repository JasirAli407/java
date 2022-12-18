package linkedlist;

public class MidPointOfLL {
	public static Node<Integer> midPoint(Node<Integer> head) {

		if (head == null || head.next == null || head.next.next == null) {
			return head;
		}

		Node<Integer> fast = head, slow = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;

	}

	public static void main(String[] args) {

	}

}
