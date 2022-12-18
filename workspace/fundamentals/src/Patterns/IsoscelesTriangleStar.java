package Patterns;
import java.util.Scanner;
public class IsoscelesTriangleStar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int i=1;
		while(i<=n) {
			int spaces =1;
			while(spaces<= (n-i)) {
				System.out.print(' ');
				spaces++;
			}
			int stars=1;
			while (stars <= (2*i-1)) {
				System.out.print('*');
				stars++;
			}
			i++;
			System.out.println();}
			
		
		
		
		}
		
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			Altenative(njn cheythadh)
//			
//			while(i<=n) {
//				int spaces =1, num=1;
//				while(spaces<= (n-i)) {
//					System.out.print(' ');
//					spaces++;}
			
//			while(num<=i) {
//				System.out.print(num);
//				num++;
//			}
//			int dec = i-1;
//			while (dec >= 1) {
//
//
//				System.out.print(dec);
//				dec = dec-1;
//				}
//			i++;
//			System.out.println();}

//	}
//
//}
