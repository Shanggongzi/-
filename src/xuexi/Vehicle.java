package xuexi;

public class Vehicle {
	double speed;
	double size;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public void move() {
		System.out.println("Œ“ª·“∆∂Ø");

	}

	public double speedup() {
		speed++;
		return speed;
	}

	public double speeddown() {
		speed--;
		return speed;
	}

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(10.3);
		double speedvalue = vehicle.getSpeed();
		System.out.println(speedvalue);
		vehicle.setSize(7.7);
		double sizevalue = vehicle.getSize();
		System.out.println(sizevalue);
		vehicle.move();
		System.out.println(vehicle.speedup());
		System.out.println(vehicle.speeddown());
		System.out.println(vehicle.speeddown());

	}

}
