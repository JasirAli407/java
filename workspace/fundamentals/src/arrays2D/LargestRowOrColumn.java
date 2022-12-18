package arrays2D;

import java.util.Scanner;

public class LargestRowOrColumn {
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
	public static void findLargest(int mat[][]){
boolean isRow = true;
int rows = mat.length;
int largestSum= Integer.MIN_VALUE;
int num=0;
if(rows==0) {
	System.out.print("row"+" "+num+" "+largestSum);
	return;
}
int cols= mat[0].length;
for(int i =0;i<rows;++i) {
	int rowSum=0;
	
	for(int j=0;j<cols;++j) {
		rowSum+=mat[i][j];
	}
	if(rowSum>largestSum) {
		largestSum=rowSum;
		num=i;
	}
}


for(int j=0;j<cols;++j) {
	int colSum=0;
	for(int i=0;i<rows;++i) {
		colSum+=mat[i][j];
		}
	if(colSum>largestSum) {
		isRow = false;
		largestSum=colSum;
		num=j;
	}
}

if(isRow /*==true*/) {
	System.out.print("row"+" "+num+" "+ largestSum);
}else {
	System.out.print("column"+" "+num+" "+ largestSum);
}		
    }
	public static void main(String[] args) {
		int[][]arr = takeInput();
		findLargest(arr);

	}

}
