package strings;

public class ReverseStringWordWise {
	public static String reverseWordWise(String input) {
String ans="";
int currentWordStart=0;
int i=0;
for(;i<input.length();i++) {
	
	if(input.charAt(i)==' ') {
		int currentWordEnd= i-1;
		String subString="";
		for(int j=currentWordStart;j<=currentWordEnd;j++) {
			subString+=input.charAt(j);
			
		}
		ans=" "+subString+ans;
        currentWordStart=i+1; 	
	}
}
int currentWordEnd= i-1;
String subString="";
for(int j=currentWordStart;j<=currentWordEnd;j++) {
	subString+=input.charAt(j);
	
}
ans=subString+ans;
	
	return ans;}
	public static void main(String[] args) {
 String str="abc def ghi";
 System.out.println(reverseWordWise(str));
	}

}
