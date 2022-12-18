package generics;

public class Print {
	//	public static < T  > void printArray(
	public static <T extends PrintInterface> void printArray(
			T arr[]) {/* it means any class that implements printinterface will be accepted here */
		for (int i = 0; i < arr.length; ++i) {
			arr[i].print();
			//						System.out.println(arr[i]);

		}
	}

	public static void main(String[] args) {

		//		int arr[] = new int[5];
		//		print(arr);   //not possible for primitive datatypes for generic method

		//		Integer arr[] = new Integer[5];
		//		printArray(arr);
		//
		//		String arrS[] = new String[5];
		//		printArray(arrS);   

		Vehicle v[] = new Vehicle[5];
		//		printArray(v);  // look note-2 for more info
		//		for (int i = 0; i < v.length; ++i) {
		//			v[i] = new Vehicle();
		//		}
		//		printArray(v);  // now it will print the address of the object

		for (int i = 0; i < v.length; ++i) {
			v[i] = new Vehicle(i + 10, "HONDA");  //creating new objects and passing arguments
		}
		//		printArray(v);  // still it will print the address of the object

		//		actually we need to call print on the object..thats what we need
		/*
		 * for that we need to create a interface that has print method and the rest have done in the above
		 * print method
		 */

		printArray(v);

		Student[] st = new Student[5];
		for (int i = 0; i < st.length; ++i) {
			st[i] = new Student(i + 1);  //creating new objects and passing arguments
		}
		printArray(st);

	}

}
