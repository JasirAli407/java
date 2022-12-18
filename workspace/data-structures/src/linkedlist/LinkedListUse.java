package linkedlist;

import java.util.Scanner;

public class LinkedListUse {

	public static Node<Integer> createLinkedList() {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(40);
		Node<Integer> n4 = new Node<>(-1);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		return n1;

	}

	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void increment(Node<Integer> head) {
		Node<Integer> temp = head;

		while (temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}

	public static int length(Node<Integer> head) {

		Node<Integer> temp = head;
		int count = 0;
		while (temp != null) {

			count++;
			temp = temp.next;
		}

		return count;
	}

	public static void printIthNode(Node<Integer> head, int i) {

		Node<Integer> temp = head;
		int count = 0;
		while (temp != null) {

			if (i == count) {
				System.out.println(temp.data);

			}
			count++;
			temp = temp.next;
		}

	}

	public static Node<Integer> takeInput() { //eg.    1 2 3 4 5 -1
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;

		while (data != -1) {
			Node<Integer> currNode = new Node<>(data);
			if (head == null) {
				head = currNode;
			} else {                                // calc for time complexity                       
				Node<Integer> tail = head;     // 1+2+3+...n-1   (loop inside else has highest degree]
				while (tail.next != null) {    // to find sum of n-1 numbers : n(n-1)/2
					tail = tail.next;           //  = O(n^2)
				}                                // BAD CODE

				tail.next = currNode;

			}
			data = s.nextInt();
		}

		return head;
	}

	public static Node<Integer> insert(Node<Integer> head, int pos, int data) {

		Node<Integer> nodeToBeInserted = new Node<>(data);
		if (pos == 0) {
			nodeToBeInserted.next = head;
			return nodeToBeInserted;
		} else {
			Node<Integer> prev = head;
			int count = 0;
			while (count < pos - 1 && prev != null) {
				prev = prev.next;
				count++;
			}
			if (prev != null) {
				nodeToBeInserted.next = prev.next;
				prev.next = nodeToBeInserted;
			}
			return head;
		}

	}

	public static void printLLRecursive(Node<Integer> head) {

		if (head == null) {
			return;
		}

		System.out.print(head.data + " ");
		printLLRecursive(head.next);
	}

	public static void main(String[] args) {

		//		Node<Integer> head = createLinkedList();
		//		System.out.println(head.data);
		//		System.out.println(head.next);
		//		//		increment(head);
		//		print(head);
		//
		//		System.out.println(length(head));
		//		printIthNode(head, 1);

		//		Node<Integer> n1 = new Node<>(10);
		Node<Integer> head = takeInput();
		//		head = insert(head, 2, 30);
		//		print(head);
		printLLRecursive(head);

	}

}
