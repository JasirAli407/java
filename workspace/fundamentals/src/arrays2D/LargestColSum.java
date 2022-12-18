package arrays2D;

import java.util.Scanner;

public class LargestColSum {
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
	public static int largestColSum(int[][] arr) {
		int rows = arr.length;
		int cols=arr[0].length;
		int largest=Integer.MIN_VALUE;
		for(int j=0;j<cols;++j) {
			int sum=0;
			for(int i =0;i<rows;++i) {
				sum+=arr[i][j];
			}
		if(sum>largest) {
			largest=sum;
		}
		}
		return largest;
	}
	public static void main(String[] args) {
int [][] arr=takeInput();	

System.out.println(largestColSum(arr));

	}

}
