package inheritance;

public abstract class Car extends Vehicle {
	//	int maxSpeed;
	int numDoors;

	public Car(int numDoors, int maxSpeed) {
		/*
		 * when car is called it will look for parents default constructor and here v have created new
		 * constructor so explicitly we have to call parent constructor
		 */
		/* another way is we can create a parent construcor like the default constructor */
		super(maxSpeed);  // here explicit call of parent must be done first for being error free
		this.numDoors = numDoors;
		System.out.println("car's constructor");
	}

	public Car() {

	}

	@Override
	public void print() {
		super.maxSpeed = 99;
		super.print();
		System.out.println(this.maxSpeed + " " + super.maxSpeed);

	}

	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public abstract String getCompany();

	//	public void print() {  //	function overriding works here!
	//		System.out
	//				.println("car " + "color:" + getColor() + "  maxSpeed:" + maxSpeed + " numDoors " + numDoors);
	//	}

}
