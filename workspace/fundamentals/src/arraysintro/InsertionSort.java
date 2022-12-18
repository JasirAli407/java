package arraysintro;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
int n= arr.length;
for ( int i=0;i<n;++i) {
	int j=i-1;
	int temp = arr[i];
	while (j>=0 && arr[j]>temp) {
		arr[j+1]=arr[j];
		--j;
}
	arr[j+1]=temp;
}		
		
		
		
		// my code:
		//		int n= arr.length;
//		for(int i =0; i<n-1;++i) {
//			int j=i+1;
//			
//			if(arr[j]<arr[i]) {
//				int temp = arr[j];
//				arr[j]=arr[i];
//				for(int a=i-1;a>=(-1);--a) {
//					if (a==(-1)) {
//						arr[a+1]=temp;
//						
//					}
//					else if (arr[a]<temp) {
//						arr[a+1]=temp;
//						break;
//					}
//					else if (arr[a]>temp) {
//						arr[a+1]=arr[a];
//					}
//				}
//			}
//		}
	}
	public static void  print(int[] arr) {
		for(int i =0;i<arr.length;++i) {
			System.out.print(arr[i]);
		}
		}
	public static void main(String[] args) {
		int[] arr = {3,7,1,8,4,9,0,5};
		insertionSort(arr);
		print(arr);
	}

}
