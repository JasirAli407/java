package strings;

public class CompressTheString {
	public static String getCompressedString(String str) {
		if(str==null) {return null;}
		if(str.length()==0) {return "";}
		String output="";
output+=str.charAt(0);
for(int i=1;i<str.length();++i) {
	int count=1;
	while(i<str.length() && str.charAt(i)==str.charAt(i-1)) {
		count++;
		
		i++;
		}
	if(count>1) {
		output+=count;
	}
	if(i<str.length()) {
output+=str.charAt(i);
}
	
}
return output;


// codezen soln
//		
//		if(str==null) {return null;}
//		if(str.length()==0) {return "";}
//		String compressedString="";
//		int startIndex=0;
//		int endIndex=0;
//		while (startIndex<str.length()) {
//			while(endIndex<str.length()&&str.charAt(endIndex)==str.charAt(startIndex)) {
//				endIndex++;
//			}
//			int charCount=endIndex-startIndex;
//			if(charCount!=1) {
//				compressedString+=str.charAt(startIndex)+""+charCount; // add emptystring
//				                                             //else reslult will be in integer
//			}
//			else {compressedString+=str.charAt(startIndex);}
//			startIndex=endIndex;
//		}
//		return compressedString;
 
	}
	public static void main(String[] args) {

		String str="aaabb";
		System.out.println( getCompressedString(str));
	}

}
