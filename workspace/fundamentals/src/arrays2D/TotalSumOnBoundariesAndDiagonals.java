package arrays2D;

import java.util.Scanner;

public class TotalSumOnBoundariesAndDiagonals {
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
	public static void totalSum(int[][] mat) {
		int boundarySum=0,diagonalSum=0,totalSum=0;
		//boundaries
				int vertSum=0;
				for(int i=0;i<mat.length;++i) {
					int leftCol=0;
					int rightCol=mat.length-1;
					vertSum=vertSum+mat[i][leftCol]+mat[i][rightCol];
				}
				int horiSum=0;
				for(int j=1;j<mat.length-1;++j) {
					int topRow =0;
					int bottomRow=mat.length-1;
					horiSum=horiSum+mat[topRow][j]+mat[bottomRow][j];
					
				}
				boundarySum=vertSum+horiSum;
				
				//diagonals
				int diagSum=0;
				for(int i=1;i<mat.length-1;++i) {
					int left=i;
					int right = mat.length-1-i;
					diagSum=diagSum+mat[i][left]+mat[i][right];
					if(left==right) {diagSum-=mat[i][left];}
				}
				totalSum=boundarySum+diagSum;
		        System.out.println(totalSum);

		}
	public static void main(String[] args) {
int[][] arr=takeInput();


	}

}
