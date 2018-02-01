package Disanzhou;

public class Singleton2 {// 懒汉模式，想用的时候才进行创建，以时间换空间
	private static Singleton2 singleton2 = null;

	private Singleton2() {

	}

	public synchronized static Singleton2 getsingleton() {// 加上一个锁预防极端情况
		// 例如2个线程同时进入if判断，同时创建，这就不叫做单例模式了。
		if (singleton2 == null) {
			singleton2 = new Singleton2();
		}
		return singleton2;
	}

}
