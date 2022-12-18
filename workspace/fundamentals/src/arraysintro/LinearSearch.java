package arraysintro;
import java.util.Scanner;
public class LinearSearch {

//	public static int[] takeInput() {
//	Scanner sc = new Scanner(System.in);
//	int n= sc.nextInt();
//	int[] arr= new int[n];
//	for (int i=0;i<n;i++) {
//		System.out.println("enter element at" + i +"th index;");
//		arr[i]= sc.nextInt();
//	}
//	return arr;
//	}
	  public static int linearSearch(int arr[], int x) {
for(int i=0; i<arr.length;i++) {
	if(arr[i]==x) {
		return i;
	}
}
 return -1;  }
	
	public static void main(String[] args) {
int [] arr = {1,3,4,2,5,6};
int x=4;
		System.out.println(linearSearch(arr, x));

	}

}
