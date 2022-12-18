package recursion_assignment;

public class CountZeros {
	public static int countZerosRec(int input){
		if(input<10){if(input == 0){
		    return 1;
		    }
		else {
		    return 0;
		}
		        }
		        int smallAns= countZerosRec(input/10);
		        if(input%10==0){
		            return smallAns+1;
		        }
		        else{
		            return smallAns;
		        }
		    }
	public static void main(String[] args) {
System.out.println(countZerosRec(00010204));
	}

}
