package xuexi;

public class Fuqin extends Yeye {
	double height;

	public Fuqin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fuqin(String name, int age, double height) {
		super(name, age);//
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	public void chifan() {

		System.out.println("����" + age + "��" + name + "���" + height + "�ڳԷ�");
	}

	public static void main(String[] args) {
		Fuqin fuqin = new Fuqin("sd", 35, 180.9);
		fuqin.chifan();
		fuqin.pao();

	}
}
