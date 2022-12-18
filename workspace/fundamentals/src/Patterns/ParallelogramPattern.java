package Patterns;
import java.util.Scanner;
public class ParallelogramPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, i=1; 
		n = s.nextInt();
		while(i<=n)
		{
			int spaces=1;
			while(spaces<= i-1)
			{
				System.out.print(' ');
				spaces++;
			}
			int stars =1;
			while(stars <=n) {
				System.out.print('*');
				stars++;
			}
			i++;
			System.out.println();		
		}

	}


}













