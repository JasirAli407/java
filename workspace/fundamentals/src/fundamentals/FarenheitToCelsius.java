package fundamentals;
import java.util.Scanner;
public class FarenheitToCelsius {

	public static void main(String[] args) {
	
				Scanner a = new Scanner(System.in);

				int s,e,w, c;

				s = a.nextInt();
				e = a.nextInt();
				w = a.nextInt();
				while(s<=e)
				{
					System.out.print(s + "\t");
					c =(s-32)*5/9;

					System.out.println(c);
					s = s+w;
				}		




				//		(F − 32) × 5/9 
				//		
				//		0 
				//		100 
				//		20
				//		
				//		
				//		0   -17
				//		20  -6
				//		40  4
				//		60  15
				//		80  26
				//		100 37
			}

		

	}


