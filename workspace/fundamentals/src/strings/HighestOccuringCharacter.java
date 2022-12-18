package strings;

public class HighestOccuringCharacter {
	public static char highestOccuringChar(String str) {
		int [] freqArray=new int [256];
		for(int i=0;i<str.length();++i) {
			int n =str.charAt(i);
			freqArray[n]++;
		}
		//		NORMAL way
		//		char mostFreq=' ';
		//		int largest=Integer.MIN_VALUE;
		//		for(int i=0;i<freqArray.length;++i) {
		//			if(freqArray[i]>largest) {
		//				largest=freqArray[i];
		//				mostFreq=(char)i;
		//			} 
		//		}
		//	return mostFreq;

		//          NEW way
		char ans=str.charAt(0);
		int count=freqArray[str.charAt(0)];

		for(int i =1;i<str.length();++i) {
			if(freqArray[str.charAt(i)]>count) {
				ans=str.charAt(i);
				count=freqArray[str.charAt(i)];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		String str="aabcccadc";
		System.out.println(highestOccuringChar( str));

	}

}
