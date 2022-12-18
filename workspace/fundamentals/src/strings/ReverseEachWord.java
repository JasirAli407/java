package strings;

public class ReverseEachWord {
	public static String reverseEachWord(String str) {
		String ans="";
		int currentWordStart=0;
		int i=0;
				for(;i<str.length();++i) {
					if(str.charAt(i)==' ') {
						int currentWordEnd =i-1;
						String reversedWord="";
						for(int j=currentWordStart;j<=currentWordEnd;j++) {
							reversedWord=str.charAt(j)+reversedWord;
						}
						ans+=reversedWord+' ';
						currentWordStart=i+1;	
					}
				}
		int currentWordEnd =i-1;
		String reversedWord="";
		for(int j=currentWordStart;j<=currentWordEnd;j++) {
			reversedWord=str.charAt(j)+reversedWord;
		}
		ans+=reversedWord;
		return ans;

		//    MYCODE
		//	int currentStart =0;
		//	String ans="";
		//	String lastWord="";
		//	for(int i=0;i<str.length();++i) {
		//		if(str.charAt(i)==' ') {
		//			String reversedWord="";
		//			for( ;currentStart<i;start++ ) {
		//				reversedWord=str.charAt(currentStart)+reversedWord;
		//			}
		//			ans+=reversedWord+' ';
		//			currentStart=i+1;
		//			
		//		}
		//	}
		//	while(currentStart<str.length()) {
		//		lastWord=str.charAt(currentStart)+lastWord;
		//		
		//		currentStart++;
		//	}
		//ans+=lastWord;
		//return ans;
	}
	public static void main(String[] args) {
		String str="abc def ghi";
		System.out.println(reverseEachWord(str));

	}

}
