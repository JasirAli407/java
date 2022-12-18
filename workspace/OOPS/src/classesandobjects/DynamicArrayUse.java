package classesandobjects;

public class DynamicArrayUse {

	public static void main(String[] args) {
		DynamicArray d1 = new DynamicArray();
		//		System.out.println(d1.size());

		d1.addAtLastIndex(1);
		//		System.out.println(d1.get(0));
		d1.addAtLastIndex(3);
		//		System.out.println(d1.get(1));
		d1.addAtLastIndex(4);
		//		System.out.println(d1.get(2));
		d1.addAtLastIndex(5);
		//		d1.add(1, 2);
		//		System.out.println(d1.get(1));

		//		while (!d1.isEmpty()) {
		//			d1.removeLastIndex();
		//			System.out.println("size - " + d1.size());
		//		}

		//		for (int i = 0; i < d1.size(); ++i) {
		//			System.out.println(d1.get(i));
		//		}
		System.out.println(d1.get(3));
	}
}
