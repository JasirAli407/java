package functions;
import java.util.Scanner;

public class Probability {
public static int fact(int num) {
	int ans=1;
	for (int i=1;i<=num;i++) {
	      ans*=i;
	}
	return ans;
}
public static int ncr(int n,int r) {
	int ans = fact(n)/fact(n-r)/fact(r);

return ans;
}
public static int probab(int n, int x) {
	int ans = ncr(4, x)*ncr(4,  n-x);
	float prob = ans*1.0f/ncr(8,n);
	
	return (int)prob;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 





}}