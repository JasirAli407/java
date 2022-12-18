package arrays2D;

public class RowWiseSum {
	public static void rowWiseSum(int[][] mat) {

        if(mat.length>0){
            int rows = mat.length;
            int cols= mat[0].length;

            for(int i =0;i<rows;++i){
                int sum=0;
                for(int j=0;j<cols;++j){
                    sum+=mat[i][j];
                }
                System.out.print(sum+" ");

            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
