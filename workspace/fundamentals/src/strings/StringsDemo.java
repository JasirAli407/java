package strings;

public class StringsDemo {

	public static void main(String[] args) {
		char[] arr = {'c','o','d','i','n','g'};  //alternate way
		String str1 = "coding";
		System.out.println(str1.length());
		System.out.println(str1.charAt(3));
		//	System.out.println(str1.charAt(6)); // error index out of bound

		String str2 = "ninjas";
//		str1= str1.concat(str2); //it will concatenate
		//	System.out.println(str1);
		
		//	System.out.println(str1+=str2); //usual += function

		//		System.out.println(str1.equals(str2)); // check whether they r equal(o/p is boolean)
             
		System.out.println(str1.compareTo(str2)); // look at  computer notes	

		System.out.println(str1.contains("ing"));  //(o/p is boolean value)

	}

}
