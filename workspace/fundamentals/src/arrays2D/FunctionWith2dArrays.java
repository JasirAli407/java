package arrays2D;

import java.util.Scanner;

public class FunctionWith2dArrays {
public static int[][] takeInput(){
	Scanner s =new Scanner(System.in);
System.out.println("Enter the no: of rows :");
int rows = s.nextInt();
System.out.println("Enter the no: of cols :");
int cols= s.nextInt();
int[][] arr2d= new int[rows][cols];
for(int i =0;i<rows;++i) {
	for(int j=0;j<cols;++j) {
		System.out.println("Enter the element at"+ i+"th row and"+j+"th col :");
		arr2d[i][j]=s.nextInt();
	}System.out.println();
}
return arr2d;
}
public static void print(int[][]arr) {
	int rows =arr.length;    // length of a 2d array is its no:of rows
	int cols= arr[0].length;  // length of any row is its no: of cols 
	for(int i =0;i<rows;++i) {
		for(int j=0;j<cols;++j) {
System.out.print(arr[i][j]);
		}System.out.println();
	}
}
/* in a 2d array elements(reference) in a particular row or array is continuous but in another row or array it may or may not be another sequence */
	public static void main(String[] args) {
int [][] input=takeInput();
print(input);
		
	}

}
