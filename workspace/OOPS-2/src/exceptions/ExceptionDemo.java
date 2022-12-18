package exceptions;

public class ExceptionDemo {

	public static int divide(int a, int b)
			throws DivideByZeroException /*
											 * throws DivideByZeroException will pass this to main()
											 */
	{
		if (b == 0) {
			throw new DivideByZeroException(); //throwing exception object
			//			throw new ArithmeticException(); //it will throw error in console
		}
		return a / b;
	}

	public static void main(String[] args)// throws DivideByZeroException 

	/* throws DivideByZeroException here will pass exceptionto run time system (RTS) */

	{
		/* if main() dont want to pass to RTS, but want to handle it, then use try-catch block */
		try {
			//			here we write code that might raise an exception
			divide(10, 0);
			/*
			 * if this call raise an exception try block will stop and catch block starts execution it will
			 * deal with it and the execution continues
			 */
			/* if there is no exception in try block catch block will be skipped */
			System.out.println("within try");
		}

		catch (DivideByZeroException e) {
			System.out.println("Divide by zero exception raised");
			//			e.printStackTrace();
		}

		//if we want we can have this catch of super class of exceptions
		catch (Exception e) {
			System.out.println("Generic Exception");
		}

		finally {
			System.out.println("Within Finally Block");
		}

		System.out.println("exec continues");

		//		System.out.println(4/0); //java.lang.ArithmeticException

		//		String s = null;
		//		System.out.println(s.length()); //java.lang.NullPointerException
	}

}
