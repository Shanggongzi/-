package Disanzhou;

public class Singleton {// 饿汉模式，先行进行创建，以空间换时间，想什么时候用就什么时候用
	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	public static Singleton getsingleton() {
		return singleton;
	}
}
