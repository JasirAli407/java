package linkedlist;

public class K_Reverse {
	public static DoubleNode reverserecDN(Node<Integer> head) {
		DoubleNode ans;

		if (head == null || head.next == null) {
			ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}

		DoubleNode smallAns = reverserecDN(head.next);
		smallAns.tail.next = head;
		head.next = null;
		ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = smallAns.tail;

		return ans;

	}

	public static Node<Integer> kReverse(Node<Integer> head, int k) {

		if (head == null || head.next == null) {
			return head;
		}

		Node<Integer> currNode = head, nextHead = null, currTail = null;

		int count = 0;

		while (count < k && currNode != null) {
			if (currTail == null) {
				currTail = currNode;
			} else {
				currTail.next = currNode;
				currTail = currTail.next;
			}
			currNode = currNode.next;
			count++;
		}

		nextHead = currNode;
		currTail.next = null;

		DoubleNode ans = reverserecDN(head);

		ans.tail.next = kReverse(nextHead, k);

		return ans.head;

	}

	public static void main(String[] args) {

		Node<Integer> head = TakingInput.takeInput();

	}
}
