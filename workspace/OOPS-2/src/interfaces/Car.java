package interfaces;

public class Car extends Vehicle implements CarInterface, VehicleInterface {

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

	@Override
	public int numGears() {
		return 6;
	}

	//	void print() {
	//		System.out.println(PI);
	//		/*
	//		 * PI variable is already present in vehicle interface; and vehicle interface and car interface is
	//		 * implemented by car class; it will clash when try to call that will generate error
	//		 */
	//	}

}
