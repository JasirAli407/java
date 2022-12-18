package temp;

import classesandobjects.Student;

public class StudentUse2 {

	public static void main(String[] args) {
		Student s1 = new Student("tk");
		s1.name = "jasir";  //public
		//System.out.println(s1.batchYear);// bcos batch year is default in "Student" class

		//		s1.setRollNumber(100);
		System.out.println(s1.getRollNumber());

	}

}
