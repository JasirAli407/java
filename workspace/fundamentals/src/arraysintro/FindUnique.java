package arraysintro;

import java.util.Scanner;

public class FindUnique {
	public static int findUnique(int[] arr){
		for(int i=0;i<arr.length;i++) {
			int j;
			for(j=0;j<arr.length;j++) {
				if(i!=j) {
					if (arr[i]==arr[j]) {
						break;
					}
				}
			}
		if(j==arr.length) {
			return arr[i];
		}
		}
	return -1;
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
		int []arr = takeInput();
		System.out.println(findUnique(arr));

	}

}
