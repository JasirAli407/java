package strings;

public class ReverseString {
	public static String reverseString(String str) {
		String reversedString= "";
             // new and simple way
		for(int i=0;i<str.length();++i) {
	reversedString=str.charAt(i)+reversedString;
}

         // this is normal way:
		//	for(int i=str.length()-1;i>=0;--i) {
		//		reversedString+=str.charAt(i);
		//	}
			return reversedString;
	}
	public static void main(String[] args) {
String str ="abcde";
String str1= reverseString(str);
System.out.println(str1);
	}

}
