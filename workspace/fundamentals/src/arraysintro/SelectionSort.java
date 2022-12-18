package arraysintro;

public class SelectionSort {
	public static void selectionSort(int[] arr) //selectionsort.arr 
	{
		for(int i = 0;i<arr.length-1;++i) {
			int min = Integer.MAX_VALUE;
			int minIndex=-1;
			for(int j=i;j<arr.length;++j) {
					
				if(arr[j]<min) {
					min=arr[j];
					minIndex=j;

				}
			}int temp =arr[minIndex]; 
					
			     arr[minIndex]= arr[i];
			     arr[i]=temp;

		} 





		//		 FOLLOWING IS MY CODE
		//for(int i =0;i<arr.length-1;++i) {
		//	for(int j=i+1;j<arr.length;++j) {
		//		if(arr[j]<arr[i]) {
		//			int temp = arr[i];
		//			arr[i]= arr[j];
		//			arr[j]= temp;
		//		}
		//	}
		////    System.out.print(arr[i]); //for seeing output
		//}
	}
	public static void  print(int[] arr) {
		for(int i =0;i<arr.length;++i) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = {3,7,1,8,4,9,0,5};//main.arr- ref eg:250,is passed to selectionsort.arr
		selectionSort(arr);
		print(arr);

	}

}
