package milestone3_test4;

public class Print2DArray {
	public static void print2DArray(int input[][]) {
		
		int n= input.length;
			int rows=input.length,cols=input[0].length;
			for(int i=0;i<rows;++i) {
				int count=1;
				while(count<=n) {
					for(int j=0;j<cols;++j) {
						System.out.print(input[i][j] + " ");
						
					}
					System.out.println();
					count++;
				}
				n--;
			}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
