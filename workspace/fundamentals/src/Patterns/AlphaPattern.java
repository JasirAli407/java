package Patterns;
import java.util.Scanner;
public class AlphaPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=1, n;
		n = s.nextInt();
		while(i<=n)
		{
	int j=1;
	while(j<=i)
	{
		char ch= (char)('A'+i-1);
		System.out.print(ch);
		j++;
	}
	System.out.println();
	i++;
		
		}
	}	


	

}
