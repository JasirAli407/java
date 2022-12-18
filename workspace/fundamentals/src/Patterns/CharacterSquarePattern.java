package Patterns;
import java.util.Scanner;
public class CharacterSquarePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=1, n;
		n = s.nextInt();
		while(i<=n)
		{
	int j=1;
	while(j<=n)
	{
		char ch= (char) ('A'+j-1);
		System.out.print(ch);
		j++;
	}System.out.println();
	i++;
		
		}
	}	


	

}
