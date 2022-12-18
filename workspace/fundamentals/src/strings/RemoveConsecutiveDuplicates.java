package strings;

public class RemoveConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String str) {
		String output="";
		int j=0;
		output+=str.charAt(j);
		for(int i=1;i<str.length();++i) {
			if(output.charAt(j)!=str.charAt(i)) {
				output+=str.charAt(i);
				j++;
			}
		}
		return output;
    }
public static void main(String[] args) {
	

	String str="aadddgghha";
	
	removeConsecutiveDuplicates(str);
System.out.print(removeConsecutiveDuplicates(str));

	
}
}
