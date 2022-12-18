package arraysintro;

import java.util.Scanner;

public class ReturnArraySum {
	public static int sum(int[] arr) {
	    
        int n= arr.length;
        
        int s=0;
    
        for(int i=0;i<n;i++){
            int num = arr[i];
            s+=num;
        }
       

        return s;
        }
public static int[] takeInput() {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int[] arr = new int[n];
	 for (int i =0;i<n;i++) {
		 System.out.println("Enter element at "+i+ "th index :"); 
		arr[i]= s.nextInt();
	 }return arr;
}

public static void main(String[] args) {
	
	int[]arr = takeInput();
	
	System.out.println(sum(arr));


	}

}
