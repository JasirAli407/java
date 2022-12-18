package inheritance;

public abstract class Vehicle {
	private String color;
	protected int maxSpeed;

	public Vehicle(int maxspeed) {
		this.maxSpeed = maxspeed;
		System.out.println("Vehicle's constructor");
	}

	public Vehicle() {
		System.out.println("Vehicle's default like constructor");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void print() {
		System.out.println("vehicles " + "color:" + color + "  maxSpeed:" + maxSpeed);
	}

	public abstract boolean isMotorized();

	public abstract String getCompany();

}
