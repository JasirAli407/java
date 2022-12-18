package Tests;

public class MinLengthWord_test3 {

	
		public static String minLengthWord(String input){
			int minLength= Integer.MAX_VALUE;
			int currSt=0;
			int currEnd;
			int minSt=0,currLength,minEnd=0;
			for(int i=0;i<input.length();++i) {
				if(input.charAt(i)==' ') {
					currEnd=i-1;
					currLength=currEnd-currSt;
					if(currLength<minLength) {
						minLength=currLength;
						minSt=currSt;
						minEnd=currEnd;
					}
					currSt=i+1;
				}
				if(i==input.length()-1) {
					currEnd=i;
					currLength=currEnd-currSt;
					if(currLength<minLength) {
						minLength=currLength;
						minSt=currSt;
						minEnd=currEnd;
					}
				}
			}
			 String minString=input.substring(minSt,minEnd+1);
			return minString;

	}
		public static void main(String[] args) {
			String str="im jasir here";	

			System.out.println(minLengthWord(str));

}
}
