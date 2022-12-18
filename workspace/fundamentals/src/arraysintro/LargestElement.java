package arraysintro;
import java.util.Scanner;
public class LargestElement {

	public static int[] takeInput() {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int[] arr= new int[n];
	for (int i=0;i<n;i++) {
		System.out.println("enter element at" + i +"th index;");
		arr[i]= sc.nextInt();
	}
	return arr;
	}
	public static int largestElement(int[] arr) {
	int	max = Integer.MIN_VALUE;
	
		for (int i =0;i<arr.length;i++) {
			
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		return max;}
	
	public static void main(String[] args) {
int[] arr = takeInput();
int large = largestElement(arr);
System.out.println(large);
	}

}
