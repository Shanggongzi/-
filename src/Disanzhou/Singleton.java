package Disanzhou;

public class Singleton {// ����ģʽ�����н��д������Կռ任ʱ�䣬��ʲôʱ���þ�ʲôʱ����
	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	public static Singleton getsingleton() {
		return singleton;
	}
}
