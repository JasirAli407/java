package interfaces;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();

		// VehicleInterface vI = new VehicleInterface;/* it'll throw ERROR, cant create a interface object*/
		VehicleInterface vI;

		vI = new Car();  // POLYMORPHISM POSSIBLE
		vI.getCompany();

	}

}
