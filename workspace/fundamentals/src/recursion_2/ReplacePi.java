package recursion_2;

public class ReplacePi {
public static String replacePi(String str) {
	if(str.length()<=1) {
		return str;
	}
	
	if(str.charAt(0)=='p' && str.charAt(1)=='i') {
		String smallString=replacePi(str.substring(2));
		return 3.14 + smallString;
	}
	else {
		String smallString= replacePi(str.substring(1));
		return str.charAt(0) + smallString;
	}
}
	public static void main(String[] args) {
System.out.println(replacePi("apibpicp"));
	}

}
