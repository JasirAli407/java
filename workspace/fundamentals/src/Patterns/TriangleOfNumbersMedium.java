package Patterns;
import java.util.Scanner;
public class TriangleOfNumbersMedium {

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
			int num = i;
			
			int k=1;
			while(k <= i) {
				System.out.print(num);
				num++;
				k++;
			}
			int dec= 2*i-2;
			while(dec >= i)
			{
				System.out.print(dec);
				dec= dec-1;
			} 
			 i++;
			System.out.println();
			
		}
		}
}
			
			
			
			
			
			
			
			
			
			
//			int dec = num-1;
//			while (dec > i) {
//				dec = dec-1;
//              System.out.print(dec);
//				
//				
//				}
//			i++;
//			System.out.println();}
//
//	}
//
//}
