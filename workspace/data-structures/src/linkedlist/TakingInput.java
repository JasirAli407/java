package linkedlist;

import java.util.Scanner;

public class TakingInput {
	public static Node<Integer> takeInput() {   // GOOD CODE
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;                    //eg.    1 2 3 4 5 -1

		while (data != -1) {
			Node<Integer> currNode = new Node<>(data);

			if (head == null) {
				head = currNode;
				tail = currNode;
			}                                                      // T= O(n) 
			else {
				tail.next = currNode;
				tail = currNode;
			}
			data = s.nextInt();
		}

		return head;
	}
	//           BAD CODE
	//	public static Node<Integer> takeInput() { //eg.    1 2 3 4 5 -1
	//		Scanner s = new Scanner(System.in);
	//		int data = s.nextInt();
	//		Node<Integer> head = null;
	//
	//		while (data != -1) {
	//			Node<Integer> currNode = new Node<>(data);
	//			if (head == null) {
	//				head = currNode;
	//			} else {                                // calc for time complexity                       
	//				Node<Integer> tail = head;     // 1+2+3+...n-1   (loop inside else has highest degree]
	//				while (tail.next != null) {    // to find sum of n-1 numbers : n(n-1)/2
	//					tail = tail.next;           //  = O(n^2)
	//				}                                // BAD CODE
	//
	//				tail.next = currNode;
	//
	//			}
	//			data = s.nextInt();
	//		}
	//
	//		return head;
	//	}

	public static void main(String[] args) {

	}

}
