package inheritance_temp;

import inheritance.Vehicle;

public class Truck extends Vehicle {

	public Truck() {
		super(100);
	}

	@Override
	public void print() {  //	function overriding works here!
		System.out.println("vehicle" + "color" + getColor() + "  maxSpeed:" + maxSpeed);
	}

	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return null;
	}

}
