package arraysintro;

public class ArraysWithFunction2 {
	public static int[] increment(int[] input) {
		input =  new int [7]; 
		for(int i=0;i<input.length;i++) {
			input[i]+=1;
		}
	
	return input;
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
		
		public static void main(String[] args) {
	int [] arr= {1,2,3,4,5};
	arr=increment(arr);
	print(arr);
		}
}
