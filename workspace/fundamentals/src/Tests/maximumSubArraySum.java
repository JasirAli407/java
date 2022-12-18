package Tests;
import java.util.*;
public class maximumSubArraySum {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int k=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;++i) {
	arr[i]=s.nextInt();// 2 7 3 6 7 7 
}

int sum=0;
for(int i=0;i<k;++i) {
	sum+=arr[i];
	
}
int currSum=sum;
for(int i=k;i<n;++i) {
	 currSum+=arr[i]-arr[i-k];
	 sum=Math.max(currSum, sum);
}
		
		
	System.out.println(sum); // 14
	}

}
