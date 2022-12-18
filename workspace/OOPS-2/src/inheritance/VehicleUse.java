package inheritance;

public class VehicleUse {

	public static void main(String[] args) {

		/* OBJECT CLASS */  //super class of all class
		//		Object o = new Vehicle(99);

		/* CLASS CAST */
		//		Vehicle v = new Car(4, 77);
		//		v = new Bicycles(); //RUNNING THIS WILL GENERATE RUN TIME ERROR
		//		Car c = (Car) v;
		/*
		 * TYPE CASTING ..this will work if there is no "v = new Bicycles();" in between
		 */

		//		/* POLYMORPHISM */
		//		Vehicle v = new Car(4, 77); // we r pointing Vehicle v to a new car object 
		// vice versa is not possible as car is child
		//		//		v.numDoors = 4   //compile time error (v can call only things in vehicles(parent) or in both)
		//		v.print(); 
		/*
		 * executes cars print function(both has print function and it calls at RUNTIME).This is called run
		 * time polymorphism
		 */

		/* inheritance and constructor relation */
		//		Vehicle v = new Vehicle(100); 
		//		Car c = new Car(4, 99); /* inheritance and constructor relation */

		//		Car c = new Car();
		//		c.color = "black";
		//		c.setColor("red");
		//		c.maxSpeed = 10000;
		//		c.numDoors = 6;
		//		c.print();
		//		Bicycles b = new Bicycles();
		//		//		b.color = "red";
		//		b.setColor("black");
		//		b.print();

	}

}
