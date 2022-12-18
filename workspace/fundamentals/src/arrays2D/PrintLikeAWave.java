package arrays2D;

public class PrintLikeAWave {
	public static void wavePrint(int mat[][]){
		if(mat.length<=0){
            return;
        }
		for(int j=0;j<mat[0].length;++j) {
			if(j%2==0) {
				for(int i=0;i<mat.length;++i) {
					System.out.print(mat[i][j]+" ");
				}
			}
			else {
				for(int i=mat.length-1;i>=0;--i) {
                   System.out.print(mat[i][j]+" ");
				}
			}
		}
	}


	public static void main(String[] args) {

	}

}
