package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);  //it will add ele 10 at the end of the arrray
		arr.add(20);  //it will add ele 20 at the end of the arrray
		arr.add(30);
		System.out.println(arr.size());

		arr.add(0, 4); //(index, element ) and right shifting by one happens;index must be within size 
		System.out.println(arr.get(2));
		System.out.println(arr.size());
		//		4 10 20 30
		arr.remove(2);   //it remove element at spec. index and left shifting by one happens
		System.out.println(arr.get(2));

		//		ANOTHER VARIANT OF remove():
		/*
		 * if we want to remove a particular integer, for that we need to pass an integer Object.class eg: we
		 * need to remove 10 so:
		 */
		//		4 10 30
		Integer i = 10;
		arr.remove(i);  // 10 will be removed and left shifting by one
		//       4 30
		System.out.println(arr.size());

		arr.set(0, 5); // (index, element) ; it replaces

		arr.add(40);
		arr.add(50);
		arr.add(60);
		for (int j = 0; j < arr.size(); ++j) {  // j for index,j iterating over the index in arr
			System.out.print(arr.get(j) + " ");
		}
		//		5 30 40 50 60
		System.out.println();

		//		Enhanced for loop - for each loop
		for (int j : arr) {                       // j is value of ArrayList element
			//			j iterating over the elements in arr
			System.out.print(j + " ");
		}

	}

}
