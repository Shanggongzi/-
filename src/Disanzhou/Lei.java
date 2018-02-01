package Disanzhou;

public class Lei {
	public void show() {
		System.out.println("FFFFFFF");

	}

	class Inlei {
		public void name() {
			System.out.println("ddddddddd");
		}
	}

	public static void main(String[] args) {
		Lei lei = new Lei();
		lei.show();
		Inlei inlei = lei.new Inlei();
		inlei.name();

	}

}
