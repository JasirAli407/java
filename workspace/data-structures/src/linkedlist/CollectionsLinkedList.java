package linkedlist;

import java.util.LinkedList;

public class CollectionsLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2); // adds at the end
		list.add(2, 3);  //(index,element)
		list.addFirst(0);
		list.set(0, 100);  // set will replace
		list.remove();  // it will remove first element
		list.remove(1);   //(index)
		System.out.println(list.size());
		System.out.println(list.get(1));

		for (int i = 0; i < list.size(); ++i) {
			System.out.print(list.get(i) + " ");
		}
	}

}
