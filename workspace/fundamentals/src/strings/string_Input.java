package strings;

import java.util.Scanner;

public class string_Input {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
int i;
i=s.nextInt();
System.out.println(i);
//		str=s.next();  // it will input next token(i.e upto a delimiter)
//		// delimiters are " ","\t" and "\n"
//		System.out.println(str+' '+str.length());
		 String str2=s.nextLine();   //it will take input after the token including delimiter  
	                                 //to the end of the line.	 
		 System.out.println(str2+' '+str2.length());
//			   String str2=s.next();  //it takes next token
		//	   System.out.println(str2+' '+str.length());	   

		// str = s.nextLine(); // for taking next line
		// System.out.println(str+" "+ str.length());
	}

}
