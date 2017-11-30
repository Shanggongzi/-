package xuexi;

public class Yeye {
	protected String name;
	protected int age;

	public Yeye() {

	}

	public Yeye(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public void chifan() {
		System.out.println(age + "的" + name + "我在吃饭");
	}

	public void pao() {
		System.out.println("爷爷会跑");
	}

	public static void main(String[] args) {
		Yeye yeye = new Yeye("d", 99);
		yeye.chifan();
	}
}
