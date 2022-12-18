package arrays2D;

import java.util.Scanner;

public class InputAndPrint {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int rows= s.nextInt();
		System.out.print("Enter the number of cols3:");
		int cols= s.nextInt();
		int [][] arr =new int[rows][cols];
		
//	Row wise inputing:
//		for(int i=0;i<rows;++i) {
//			for(int j=0;j<cols;++j) {
//				System.out.println("Enter the element at"+i+" th column and"+j+" th row:");
//				arr[i][j]=s.nextInt();
//			}
//		}
//		for(int i=0;i<rows;++i) {
//			for(int j=0;j<cols;++j) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}

		
		
//		input taking col wise :
				for(int j=0;j<cols;++j) {
			for(int i=0;i<rows;++i) {
				System.out.println("Enter the element at"+j+" th column and"+i+" th row:");
				arr[i][j]=s.nextInt();	
			}
		}
		for(int i=0;i<rows;++i) {
		for(int j=0;j<cols;++j) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
			
				}
				
			


}

