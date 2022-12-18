package strings;

public class CheckPermutation {
	public static boolean isPermutation(String str1, String str2) {

if(str1.length()!=str2.length()) {
	return false;
}		
		int []freqArr=new int [256];// default value of elements is 0
for(int i=0;i<str1.length();++i) {
	int j= str1.charAt(i);
	++freqArr[j];
}
for(int i=0;i<str2.length();++i) {
	int j= str2.charAt(i);
	freqArr[j]--;
}
for(int i=0;i<freqArr.length;i++) {
	if(freqArr[i]!=0) {
		return false;
		
	}
}

return true;	
	}
	public static void main(String[] args) {

		String str1="aba";
		String str2="bab";
		System.out.println(isPermutation(str1,str2));
	}

}
