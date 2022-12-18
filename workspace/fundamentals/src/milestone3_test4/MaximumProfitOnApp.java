package milestone3_test4;
import java.util.*;
public class MaximumProfitOnApp {
	public static int maximumProfit(int budget[]) {
		 Arrays.sort(budget);
     int maxProfit=Integer.MIN_VALUE;
		
		for(int i=0;i<budget.length;++i) {
		int temp=budget[i];
		int count= budget.length-i;
		int profit= temp*count;
		if(profit>maxProfit) {
			maxProfit=profit;
		}
		}
		return maxProfit;


	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
