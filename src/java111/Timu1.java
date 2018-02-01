package java111;

//题目：企业发放的奖金根据利润提成。
//利润(I)低于或等于10万元时，奖金可提10%；
//利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
//20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
//60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润，求应发放奖金总数？
public class Timu1 {
	double i;

	public Timu1(double i) {
		super();
		this.i = i;
	}

	public double jiangjin() {
		double sum;
		if (i <= 0) {
			System.out.println("不发钱");
			return 0;

		} else if (i <= 100000) {
			sum = i + i * 0.1;
			return sum;

		} else if (i <= 200000) {
			sum = 100000 * 0.1 + 0.075 * (i - 100000);
			return sum;

		} else if (i <= 400000) {
			sum = 100000 * 0.1 + 20 * 0.075 + 0.05 * (i - 200000);
			return sum;
		} else if (i <= 600000) {
			sum = 100000 * 0.1 + 20 * 0.075 + 0.05 * 400000 + 0.03 * (i - 400000);
			return sum;

		} else if (i <= 1000000) {
			sum = 100000 * 0.1 + 20 * 0.075 + 0.05 * 400000 + 0.03 * 600000 + 0.015 * (i - 600000);
			return sum;
		} else {
			sum = 100000 * 0.1 + 20 * 0.075 + 0.05 * 400000 + 0.03 * 600000 + 0.015 * 1000000 + 0.01 * (i - 1000000);
			return sum;
		}

	}

	public static void main(String[] args) {
		Timu1 timu1 = new Timu1(100000);
		System.out.println(timu1.jiangjin());

	}

}
