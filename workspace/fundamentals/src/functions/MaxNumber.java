package functions;
import java.util.Scanner;

public class MaxNumber {
public static int maxnumber(int n) {
	int maxNum=0;
	int i =1;
	while(n/i>0) {
		int newNum = n/(i*10)*i+n%i;
		i*=10;
		if(maxNum<newNum) {
			maxNum=newNum;
		}
	} 
	return maxNum;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 
int maxnum= maxnumber(n);
System.out.println(maxnum);
	}
	}




