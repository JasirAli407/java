package Patterns;
import java.util.Scanner;
public class AlphaPattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=1, n;
		n = s.nextInt();
		while(i<=n)
		{
	int j=1;
	char p;
	p = (char)('A'+n-i);
	while(j<=i)
	{
		
		System.out.print(p);
		p= (char)(p+1);
		j++;
	}System.out.println();
	i++;
		
		}
	}	


	

}
