package fundamentals;

import java.util.Scanner; // we must import scanner, S of scanner always capita

public class InputTaking 
{public static void main(String[] args) {
	
Scanner s = new Scanner(System.in);
String a = s.next();       // s to be caps , the next first word is only taken
                          // s.nextLine();    next entire line is taken
               // there is NO direct way like s.nextChar to take a single character input
// so, if we want to take a single character, do as follows
char ch = a.charAt(0);
 System.out.println(ch);

	//	int a,b, c;
//	Scanner s = new Scanner(System.in); // S must be capital for scanner and system
//	a = s.nextInt(); //I must be capital for int
//	b = s.nextInt();
//	c=a+b;
//	System.out.print(c);
	
/* we can have here s.nextDouble();
                     s.nextLong();  etc..
  */
			
}
}
