package fundamentals;
import java.util.Scanner;
public class SumOfNNaturalNmubers {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);

		int sum=0, i=1, n;
n = s.nextInt();
		while(i <=n)
		{
			sum = sum + i;
			i =i+1;
		}
			System.out.print(sum);
		
				
	}

}
