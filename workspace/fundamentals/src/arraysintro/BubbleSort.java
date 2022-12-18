package arraysintro;

public class BubbleSort {
public static void bubbleSort(int [] arr) {
int n = arr.length;
for(int i=0;i<n-1;++i) {
	for (int j=0;j<n-1-i;++j) {
		if(arr[j]>arr[j+1]) {
			int temp = arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
	}
}
	
	//following is my code
	//	int n= arr.length-1;
//	int maxRound=n;
//	for(int round=1;round<=maxRound;++round) {
//	for (int i=0;i<n;++i) {
//		int j=i+1;
//			if (arr[j]<arr[i]) {
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		
//		}
//	n-=1;
//	}
}
public static void  print(int[] arr) {
	for(int i =0;i<arr.length;++i) {
		System.out.print(arr[i]);
	}
}
	public static void main(String[] args) {
		int[] arr = {3,7,1,8,4,9,0,5};
		bubbleSort(arr);
		print(arr);
	}

}
