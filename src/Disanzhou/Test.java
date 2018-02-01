package Disanzhou;

public class Test {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getsingleton();
		Singleton singleton2 = Singleton.getsingleton();
		Singleton2 singleton22 = Singleton2.getsingleton();
		Singleton2 singleton23 = Singleton2.getsingleton();
		System.out.println(singleton == singleton2);
		System.out.println(singleton22 == singleton23);
	}

}
