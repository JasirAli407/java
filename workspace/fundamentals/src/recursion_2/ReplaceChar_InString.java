package recursion_2;

public class ReplaceChar_InString {
public static String replaceChar(String str,char a,char b) {
	if(str.length()==0) {
		return str;
	}
	String smallString= replaceChar(str.substring(1),a,b);
	if(str.charAt(0)==a) {
		return b+smallString;
	}
	else {
		return str.charAt(0)+smallString;
	}
}
	public static void main(String[] args) {
String str="axcxbxy";
char a='x',b='y';
System.out.println(replaceChar(str,a,b));

	}

}
