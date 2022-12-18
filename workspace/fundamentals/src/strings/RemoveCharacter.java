package strings;

public class RemoveCharacter {
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String output="";
		for(int i=0;i<str.length();++i) {
			if(str.charAt(i)!=ch) {
				output+=str.charAt(i);
			}
		}
		return output;
	}
	public static void main(String[] args) {
		String str="aabccbaa";
		char ch ='a';
		System.out.println(removeAllOccurrencesOfChar(str, ch));

	}

}
