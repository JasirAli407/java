package linkedlist;

class DoubleNode {

	Node<Integer> head;
	Node<Integer> tail;

}

public class ReverseLL_recursive {
	//	   TC = O(N)
	public static Node<Integer> reverseLinkedListRecBest(Node<Integer> head) {
		if (head == null || head.next == null)  // if length is 0 or 1  
		{
			return head;
		}

		Node<Integer> reversedHead = reverseLinkedListRecBest(head.next);
		head.next.next = head;  //or we can write   // Node<Integer> reversedTail = head.next;
		head.next = null;                           //  reversedTail.next = head;
		return reversedHead;                         //   head.next = null;  

	}

	//	          rec.relation : T(N) = T(N-1) + N-1 ;   TC = O(N^2)

	//	public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
	//		if (head == null || head.next == null)  // if length is 0 or 1  
	//		{
	//			return head;
	//		}
	//
	//		Node<Integer> reversedHead = reverseLinkedListRec(head.next);
	//		Node<Integer> tail = reversedHead;
	//
	//		while (tail.next != null) {
	//			tail = tail.next;
	//		}
	//
	//		tail.next = head;
	//		head.next = null;
	//		return reversedHead;
	//
	//	}

	//	               TC = O(n)       its better not the best
	public static DoubleNode reverseLinkedListRecDoubleNode(Node<Integer> head) {

		DoubleNode ans;
		if (head == null || head.next == null)  // if length is 0 or 1  
		{
			ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}

		DoubleNode smallAns = reverseLinkedListRecDoubleNode(head.next);
		smallAns.tail.next = head;
		head.next = null;
		ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;

	}

	public static Node<Integer> reverseLinkedListRecDoubleNodeCalling(Node<Integer> head) {
		DoubleNode ans = reverseLinkedListRecDoubleNode(head);
		return ans.head;

	}

	public static void main(String[] args) {

		Node<Integer> head = TakingInput.takeInput();
		head = reverseLinkedListRecDoubleNodeCalling(head);
		PrintLL.print(head);

	}

}
