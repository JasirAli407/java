package recursion_2;

public class RemoveConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()<=1){
            return s;
        }
        
        if(s.charAt(0)==s.charAt(1)){
            String smallString = removeConsecutiveDuplicates(s.substring(1));
            return smallString;
        }
        else{
            String smallString = removeConsecutiveDuplicates(s.substring(1));
            return s.charAt(0) + smallString;
        }

	}

	public static void main(String[] args) {
System.out.println(removeConsecutiveDuplicates("abbbccpaaaa"));
	}

}
