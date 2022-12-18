package strings;

public class CheckPalindrome {
	public static boolean isPalindrome(String str) {
		
		int st=0;
		int end = str.length()-1;
		while(st<end) {
			if(str.charAt(st)!=str.charAt(end)){
				return false;
			}
			st++;
			end--;
		}
		return true;

          // REVERSE WAY
		//	String reverseStr="";
		//	for(int i=0;i<str.length();++i) {
		//		reverseStr=str.charAt(i)+reverseStr;
		//		}
		//	if(reverseStr==str) { }

	}
	public static void main(String[] args) {

	}

}
