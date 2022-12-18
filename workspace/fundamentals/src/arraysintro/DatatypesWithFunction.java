package arraysintro;

public class DatatypesWithFunction {
public static void increment(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		arr[i]=arr[i]+1;
		
	}
} 
	
	public static void main(String[] args) {
int []arr= {1,2,3,4,5};

increment(arr);		
	}

}
