package fundamentals;

import java.util.Scanner;

public class CharacterCase {public static void main(String[] args) {
	Scanner s = new Scanner(System.in); 
	int i;
	String n= s.next();
	
	char a = n.charAt(0);
	
	 i = a;
	 
	 if(i>=97 && i<=123)
	 {
		 System.out.print("0");
	 }
	 else if (i>=65 && i<=90)
	 {
		 System.out.print("1");
		 }
	 else {
		 System.out.print("-1");
		
	 }
	
}
}


