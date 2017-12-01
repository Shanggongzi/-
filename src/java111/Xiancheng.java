package java111;

public class Xiancheng extends Thread {
	String ss;

	public Xiancheng(String ss) {
		super();
		this.ss = ss;
	}
	//
	// public void run() {
	// for (int i = 0; i < 100; i++) {
	// System.out.println(i);
	//
	// }
	//
	// }

	public void run() {
		if (ss.equals("jishu")) {
			for (int i = 1; i < 100; i += 2) {
				System.out.println(i);
			}
		} else if (ss.equals("oshu")) {
			for (int i = 2; i < 100; i += 2) {
				System.out.println(i);
			}

		} else {
			System.out.println("cuowu");
		}

	}

	public static void main(String[] args) {
		Xiancheng xiancheng = new Xiancheng("jishu");
		xiancheng.start();
		Xiancheng xiancheng2 = new Xiancheng("oshu");
		xiancheng2.start();

	}

}
