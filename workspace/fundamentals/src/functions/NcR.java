package functions;
import java.util.Scanner;
public class NcR {
	public static int factorial(int num) {
		int fact=1;
		for(int i=1; i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int r = sc.nextInt();

 int factN= factorial(n);
 int factR=factorial(r);
 int factNR= factorial(n-r);
 
 int ncr= factN/(factR*factNR);
System.out.print(ncr);


		//		int factN=1;
		//		for (int i=1; i<=n; i++) {
		//			factN*=i;
		//		}
		//
		//		int factR=1;
		//		for (int i=1; i<=r; i++) {
		//			factR*=i;
		//		}
		//		int factNR=1;
		//		for (int i=1; i<=n-r; i++) {
		//			factNR*=i;
		//		}
		//		int ncr= factN/(factR*factNR);
		//		System.out.print(ncr);

	}

}
