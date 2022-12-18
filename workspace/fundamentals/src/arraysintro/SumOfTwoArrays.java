package arraysintro;

public class SumOfTwoArrays {
	 public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
	   int n=arr1.length-1,m=arr2.length-1,k=Math.max(n+1, m+1),num=0,carry=0;
			   while(n>=0 && m>=0) {
				   num = arr1[n]+arr2[m]+carry;
				   output[k]=num%10;
				   carry=num/10;
				   k--;
				   n--;
				   m--;
				   
			   }
			   while(n>=0) {
				   num = arr1[n]+carry;
				   output[k]=num%10;
				   carry=num/10;
				   k--;
				   n--;
			   }
			   while(m>=0) {
				   num = arr2[m]+carry;
				   output[k]=num%10;
				   carry=num/10;
				   k--;
				   m--;
			   }
			   output[k]=carry;
	 }
	    
	 public static void  print(int[] arr) {
			for(int i =0;i<arr.length;++i) {
				System.out.print(arr[i]);
			}
		}
	public static void main(String[] args) {
		int[] arr1= {2,1,9,6};
		int[] arr2= {3,1,4,7};
		int[] output=new int [arr1.length+1];
		sumOfTwoArrays(arr1,arr2,output);
		print(output);
		
		

	}

}
