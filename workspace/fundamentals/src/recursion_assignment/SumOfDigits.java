package recursion_assignment;

public class SumOfDigits {
	public static int sumOfDigits(int input){
		if(input<10)  /*or  if(input/10==0) */{
            return input;
        }
        int smallSum= sumOfDigits(input/10);
        return smallSum+(input%10);

	}
	public static void main(String[] args) {
System.out.println(sumOfDigits(123));
	}

}
