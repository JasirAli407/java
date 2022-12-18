package strings;

public class PrintAllSubstring {
	public static void printSubstrings(String str) {
		if (str.length()==0){
			return;
		}
//    Tutors way
		int n= str.length();
		
		for(int substrLength=1;substrLength<=4;substrLength++) {
			for(int start=0;start<=n-substrLength;++start) {
				  int end=start+substrLength-1;
				System.out.println(str.substring(start, end+1));
			}
		}


		//         Simple way
		//	for (int st=0;st<str.length();++st) {
		//		for(int end=st;end<str.length();end++) {
		//			System.out.println(str.substring(st, end+1));
		//		}
		//	}	
		//	          MYCODE
		//		for (int st=0;st<str.length();++st) {
		//		for(int end=st+1;end<=str.length();end++) {
		//			System.out.println(str.substring(st, end));
		//		}
		//	}
	}
	public static void main(String[] args) {
		String str ="pqrs";
		printSubstrings(str);
	}

}
