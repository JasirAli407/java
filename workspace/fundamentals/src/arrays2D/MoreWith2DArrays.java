package arrays2D;

public class MoreWith2DArrays {

	public static void main(String[] args) {
//int[][] arr = new int [3][5];
//System.out.println(arr[0][0]);

int arr[][]= new int [4][];  //we must give atleast the row inorder to work 
System.out.println(arr);
//	for (int i=0;i<arr.length;++i) {
//		System.out.println(arr[i]);   //output is null
//	}
//	System.out.println(arr[0][0]);    // o/p is error
	
	
//we can initialise 1darray(giving 1d array reference) in 2darray like this i.e
//	for(int i=0;i<arr.length;++i) {
//		arr[i]= new int [5];  //initialised with default value 0 
//	}   


//we can initialise 1d array with different size in 2d array 
for (int i=0;i<arr.length;++i) {
	arr[i]= new int [i+2];  // reference of each will be stored in 2d array
}  //this type of array with different size for each row(array)is called JAGGED ARRAYS

for (int i = 0;i<arr.length;++i) {
	for (int j=0;j<arr[i].length;++j)
		{System.out.print(arr[i][j]+ " ");
		}
	System.out.println(); 
}

	}

}
