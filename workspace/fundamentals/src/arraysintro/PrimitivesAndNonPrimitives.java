package arraysintro;

public class PrimitivesAndNonPrimitives {
public static void increment(int[] input) {
//	input =  new int [7]; if this is given, when print() is called arr[] value will be printed
	for(int i=0;i<input.length;i++) {
		input[i]+=1;
	}
}
public static void print(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
	
	public static void main(String[] args) {
int [] arr= {1,2,3,4,5};
increment(arr);
print(arr);
	}

}
