package fundamentals;
import java.util.Scanner;
public class LargestOfTWo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a, b;
		a = s.nextInt();
		b = s.nextInt();

		//		              //following is a nested if else
		//
		//		if (a>b) {
		//			System.out.println(a+"is bigger");	
		//		}
		//		else {                       /*if we skip this "else" and next 'if' is false 
		//		                             next "else" will be executed and error comes*/
		//			if (b>a) {
		//				System.out.println(b+"is bigger");
		//			}
		//			else {
		//				System.out.println("both are equal");
		//			} }

        // above can be done with if also but all 'if' will be checked
	        	
		               //following is if elseif else
		
		if (a>b) {
						System.out.println(a+"is bigger");	
					}
					else if (b>a) {
							System.out.println(b+"is bigger");
						}
						else {
							System.out.println("both are equal");
						} }
		
	}


