package linkedlist;

public class AppendLastNToFirst {

	//	                     SOLUTION CODE
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {

		if (n == 0 || head == null) {
			return head;
		}

		Node<Integer> fast = head;
		Node<Integer> slow = head;
		Node<Integer> initialHead = head;

		for (int i = 0; i < n; ++i) {
			fast = fast.next;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		Node<Integer> temp = slow.next;
		slow.next = null;
		fast.next = initialHead;
		return head = temp;
	}

	//	         my code
	//	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
	//      if(head == null  || N == 0){
	//      return head;
	//  }

	// 
	//  

	//Node<Integer> temp = head;
	//  int length = 0;
	//  while(temp != null){
	//      temp = temp.next;
	//       length++;
	//  }

	//  int newHeadPos = length - n;

	//  Node<Integer> newHead = null;
	// Node<Integer> newTail = null;
	//  Node<Integer> oldTail = null;
	//  temp = head;
	//  int count = 0;
	//  while(temp != null){
	//      if(count == newHeadPos-1){
	//          newTail = temp;
	//      }

	//     if(count == newHeadPos){
	//          newHead = temp;
	//      }

	//      if(count == length - 1){
	//         oldTail = temp;
	//      }

	//      count++;
	//      temp = temp.next;
	//  }

	//  newTail.next = null;
	//  oldTail.next = head;
	//  return head = newHead;
	//	}

	public static void main(String[] args) {

	}

}
