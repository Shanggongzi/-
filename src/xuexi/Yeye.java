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
		System.out.println(age + "��" + name + "���ڳԷ�");
	}

	public void pao() {
		System.out.println("үү����");
	}

	public static void main(String[] args) {
		Yeye yeye = new Yeye("d", 99);
		yeye.chifan();
	}
}
