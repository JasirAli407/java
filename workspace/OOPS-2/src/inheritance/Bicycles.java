package inheritance;

public class Bicycles extends Vehicle {
	String company;

	public Bicycles() {
		super(99);
	}

	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return null;
	}

}
