package arrays2D;

public class Store2DArrays {

	public static void main(String[] args) {
int[][] arr2d = {{1,2,3,4},{5,6,7,8},{8,7,6,5}};
	System.out.println(arr2d);
	System.out.println(arr2d[0]);
	System.out.println(arr2d[1]);
	System.out.println(arr2d.length); // gives no: of rows(actually it is arrays)
	System.out.println(arr2d[1].length);// no: of cols
	System.out.println(arr2d[0][2]); // gives value 
	}

}
