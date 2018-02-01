package java111;

public class Circle666 extends Bianchengti6 {
	double r;

	public Circle666(double r) {
		super();
		this.r = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double mianji = 3.14 * r * r;
		return mianji;
	}

	@Override
	public String toString() {
		return "Circle666 [area()=" + area() + "]";
	}

}
