package linkedlist;

public class InsertAt_ith_recursive {

	public static Node<Integer> insertAt_Ith_Recursive(Node<Integer> head, int data, int pos) {

		if (pos == 0) {
			Node<Integer> newNode = new Node<Integer>(data);
			newNode.next = head;
			head = newNode;
			return head;
		}

		if (head == null)  //if(head == null && pos > 0)  miss ingne aan codeythe
		{
			return head;
		}

		else {
			head.next = insertAt_Ith_Recursive(head.next, data, pos - 1);
			return head;
		}
	}

	public static void main(String[] args) {
		Node<Integer> head =// TakingInput.takeInput();

				head = insertAt_Ith_Recursive(null, 9, 0);
		PrintLL.print(head);
	}
}
