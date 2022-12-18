package classesandobjects;

public class Student {
	public String name;
	private int rollNumber;
	int batchYear;
	double cgpa;
	final static double CONVERSIONFACTOR = .95;
	private static int numStudents;

	// default CONSTRUCTOR(v dont need to create
	// this..look book for more)
	// public Student() {
	//
	// }

	/* getters */
	public static int getNumStudents() {

		//		  System.out.println(rollNumber); 
		/*
		 * will be an ERROR bcos rollnum is non static property tied to an object but ucan call this static
		 * func() without object so it dont know whose roll num it is calling
		 */
		return numStudents;
	}

	// CONSTRUCTOR explicitly created
	public Student(String name) {
		this.name = name;
		numStudents++;
		this.rollNumber = numStudents;

	}

	public void print() {
		System.out.println(name + " " + rollNumber);
	}

	//	            setters        	(local variable) 
	public void setRollNumber(int rollNumber) {

		System.out.println("this " + this);
		// (property) (local var)
		this.rollNumber = rollNumber;
	}

	public int getRollNumber() {
		return rollNumber;
	}

}
