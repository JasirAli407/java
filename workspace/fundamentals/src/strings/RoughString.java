package strings;

public class RoughString {
	public static String reverseEachWord(String str) {
		String reversed="";
		int start=0;
		int end;
		for(int i=0;i<str.length();++i) {
			
			if(str.charAt(i)==' ') {
				end=i-1;
				String currWord="";
				for(int j=start;j<=end;++j) {
					currWord=str.charAt(j)+currWord;
				}
				reversed+=currWord+' ';
				start=i+1;
			}
		}
		String lastWord="";
		end=str.length()-1;
		for(int j=start;j<=end;++j) {
			lastWord=str.charAt(j)+lastWord;
		}
		return reversed+lastWord;
	 }
	

	public static void main(String[] args) {
		String str="ab cd ef";

	}


}
