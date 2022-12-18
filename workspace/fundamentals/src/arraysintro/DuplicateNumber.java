package arraysintro;

import java.util.Scanner;

public class DuplicateNumber {
	public static int duplicateNumber(int arr[]) {
	int n=arr.length;
		for (int i=0;i<=n-2;i++) {
			for (int j=i+1;j<=n-2;j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		
	return -1;}
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		 for (int i =0;i<=n-2;i++) {
			 System.out.println("Enter element at "+i+ "th index :"); 
			arr[i]= s.nextInt();
		 }return arr;
	}
	public static void main(String[] args) {
int[] arr= takeInput();
System.out.println(duplicateNumber(arr));
	}

}
