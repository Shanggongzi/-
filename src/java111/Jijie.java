package java111;

public class Jijie {
	public static void main(String[] args) {
		Enumjijei chuntian = Enumjijei.Spring;
		Enumjijei xiatian = Enumjijei.Summer;
		Enumjijei qiutian = Enumjijei.Autumn;
		Enumjijei dongtian = Enumjijei.Winter;
		System.out.println(chuntian);

		if (xiatian == Enumjijei.Summer) {
			System.out.println("ss");
		}
		if (dongtian.equals(Enumjijei.Winter)) {
			System.out.println("ww");
		}
		switch (qiutian) {
		case Autumn:
			System.out.println("yes");
			break;
		case Winter:
			System.out.println("no");
			break;
		default:
			System.out.println("gun");
		}

	}
}
