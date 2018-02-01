package xuexi;

public class Add {
	int num1;
	int num2;

	public Add() {

	}

	public Add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}

	public Add(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);
	}

	public Add(long num1, long num2) {
		long sum = num1 + num2;
		System.out.println(sum);

	}

	public Add(float num1, float num2) {
		float sum = num1 + num2;
		System.out.println(sum);

	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Add add = new Add(2.0, 3.0);

	}

}
