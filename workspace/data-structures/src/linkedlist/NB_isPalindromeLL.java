package linkedlist;

public class NB_isPalindromeLL {
	public static Node<Integer> reverseLinkedList(Node<Integer> head) {

		Node<Integer> curr = head;
		Node<Integer> fast = null;
		Node<Integer> prev = null;

		while (curr != null) {

			fast = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fast;

		}
		return prev;

	}

	public static boolean isPalindrome(Node<Integer> head) {

		if (head == null || head.next == null) {
			return true;
		}

		//	         find list center
		Node<Integer> fast = head;
		Node<Integer> slow = head;

		while (fast.next != null && fast.next.next != null) {

			fast = fast.next.next;
			slow = slow.next;
		}

		Node<Integer> secondHead = slow.next;
		slow.next = null;

		secondHead = reverseLinkedList(secondHead);

		//	         compare  two sublists now
		Node<Integer> firstSubList = head;
		Node<Integer> secondSublist = secondHead;

		while (secondSublist != null) {
			if (!firstSubList.data.equals(secondSublist.data)) {
				return false;
			}
			firstSubList = firstSubList.next;
			secondSublist = secondSublist.next;
		}

		//	         rejoin two sublist to restore the inputlist into its original form
		firstSubList = head;
		secondHead = reverseLinkedList(secondHead);

		while (firstSubList.next != null) {
			firstSubList = firstSubList.next;
		}

		firstSubList.next = secondHead;

		return true;

	}

}
