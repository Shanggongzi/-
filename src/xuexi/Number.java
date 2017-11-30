package xuexi;

public class Number {
	private int num1;
	private int num2;

	public Number() {

	}

	public Number(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add() {
		int sum = num1 + num2;
		return sum;
	}

	public int sub() {
		int sum = num1 - num2;
		return sum;
	}

	public int multi() {
		int sum = num1 * num2;
		return sum;
	}

	public double div() {
		double sum = (double) (num1) / (double) (num2);
		return sum;
	}

	public static void main(String[] args) {
		Number number = new Number(2, 3);
		System.out.println(number.add());
		System.out.println(number.sub());
		System.out.println(number.multi());
		System.out.println(number.div());

	}

}
