package Disanzhou;

public class Singleton2 {// ����ģʽ�����õ�ʱ��Ž��д�������ʱ�任�ռ�
	private static Singleton2 singleton2 = null;

	private Singleton2() {

	}

	public synchronized static Singleton2 getsingleton() {// ����һ����Ԥ���������
		// ����2���߳�ͬʱ����if�жϣ�ͬʱ��������Ͳ���������ģʽ�ˡ�
		if (singleton2 == null) {
			singleton2 = new Singleton2();
		}
		return singleton2;
	}

}
