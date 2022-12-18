package arrays2D;

public class PrintSpiral {
	public static void spiralPrint(int matrix[][]){
		int colSt=0,colEnd=matrix[0].length-1;
		int rowSt=0, rowEnd=matrix.length-1;
		int counter=0;
		int i=0,j=0;
		while(counter<matrix.length*matrix[0].length) {
			j=colSt;
			while(j<=colEnd) {
				System.out.print(matrix[rowSt][j]+" ");
				counter++;
				j++;
			}
			rowSt++;
			i=rowSt;
			while(i<=rowEnd) {
				System.out.print(matrix[i][colEnd]+" ");
				counter++;
				i++;
			}
			colEnd--;
			j=colEnd;
			while(j>=colSt) {
				System.out.print(matrix[rowEnd][j]+" ");
				counter++;
				j--;
			}
			rowEnd--;
			i=rowEnd;
			while(i>=rowSt) {
				System.out.print(matrix[i][colSt]+" ");
	            counter++;
	            i--;
			}colSt++;
		}
	}

	public static void main(String[] args) {

	}
}
