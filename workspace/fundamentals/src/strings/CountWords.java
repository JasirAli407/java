package strings;

public class CountWords {
	public static int countWords(String str) {	
		int counter = 0;
		  if(str.length()==0){return 0;}
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)==' '){
                counter++;
            }
        }
	if (counter>0){counter++;}
        return counter;
    }
	public static void main(String[] args) {
		
	}

}
