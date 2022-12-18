package generics;

public class PairUse {

	public static void main(String[] args) {

		//		Pair<Pair<Integer, String>, String> p = new Pair<>();
		//		System.out.println(p.getFirst());  // o/p is null(default value)
		//
		//		Pair<Integer, String> pInner = new Pair<>();
		//		p.setFirst(pInner);
		//		System.out.println(p.getFirst());
		//		/*
		//		 * it gives address of the first(here first is a pair . that's why address)
		//		 */
		//		pInner.setFirst(134);
		//		pInner.setSecond("firstsecond");
		//		p.setSecond("secondsecond");
		//		System.out.println(p.getFirst().getFirst() + " " + p.getFirst().getSecond() + " " + p.getSecond());
		/* to get the first in first and second in first */

		//      SIMPLE PAIR CREATION		
		//		Pair<Integer, String> obj1 = new Pair<>();
		//		obj1.setFirst(9);
		//		obj1.setSecond("awe");
		//
		//		Pair<Double, Character> obj2 = new Pair<>(1.0, 'a');

		//		Pair<Integer> pI = new Pair<>(1, 2);
		//		System.out.println(pI.getFirst());
		//
		//		Pair<Double> pD = new Pair<>(1.3, 2.5);
		//		System.out.println(pD.getFirst());
		//
		//		Pair<Character> pC = new Pair<>('x', 'd');
		//		System.out.println(pC.getFirst());
		//
		//				Pair<String> pS = new Pair<>("afs", "csdf");
		//				System.out.println(pS.getFirst());

	}

}
