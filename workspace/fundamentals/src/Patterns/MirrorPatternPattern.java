package Patterns;
import java.util.Scanner;
public class MirrorPatternPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{  
			int spaces=1,stars=1; 
			while(spaces <= n-i)
			{
				System.out.print(' ');
				spaces++;
			}
		while(stars<=i) {
			System.out.print('*');
			stars++;
		}
		System.out.println();
		i++;
		}



	}

}
