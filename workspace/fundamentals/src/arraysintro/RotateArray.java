package arraysintro;

public class RotateArray {
public static void rotate(int[] arr, int d) {
    int n = arr.length-1;
    int st = 0;
    int end = n;
    while(st<end) {
    	int temp= arr[st];
    	arr[st]= arr[end];
    	arr[end]=temp;
    	++st;
    	end--;
    }
    n= n-d;
    st=0;
    end=n;
    while(st<end) {
    	int temp= arr[st];
    	arr[st]= arr[end];
    	arr[end]=temp;
    st++;end--;
    }
    st=n+1;
    end=arr.length-1;
    while(st<end) {
    	int temp= arr[st];
    	arr[st]= arr[end];
    	arr[end]=temp;
         st++;end--;  
    }
}
    public static void  print(int[] arr) {
		for(int i =0;i<arr.length;++i) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
int arr []= {1,2,3,4,5,6,7};
rotate(arr,2);
print(arr);
	}

}
