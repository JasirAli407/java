package generics;

public class Student implements PrintInterface {

	int rollNum;

	public Student(int rollNum) {

		this.rollNum = rollNum;
	}

	@Override
	public void print() {
		System.out.println(this.rollNum);
	}

}
