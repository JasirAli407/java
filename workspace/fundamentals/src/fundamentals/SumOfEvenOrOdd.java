package fundamentals;
import java.util.Scanner;
public class SumOfEvenOrOdd {


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int soe=0,soo=0;
		while(n!=0)                //eg;  1234
		{
			int temp=n%10;         // 4
			if(temp%2==0)             
			{soe+=temp;}              
			if(temp%2!=0)
			{soo+=temp;}
			n=(int)(n/10);               // 123
		}
		System.out.println(soe+"   "+soo);

	}
}



