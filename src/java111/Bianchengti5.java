package java111;

import java.util.ArrayList;

/*��System�����о�̬����public static void arraycopy(
		Object src,  
		int srcPos,  
		Object dest, 
		int destPos,
		int length):
������������src�ӵ�srcPos��Ԫ�ؿ�ʼ��length��Ԫ�ؿ�����Ŀ������dest��destPos��ʼ��length��Ԫ�ء����Լ�ʵ���������*/
public class Bianchengti5 {
	public static void arraycopy() {
		Object[] src = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int srcPos = 3;// Ĭ�ϵڼ������������±�
		Object[] dest = { 2, 7, 9, 11, 14, 19, 70, 90 };
		int destPos = 2;
		int length = 4;
		ArrayList<Object> list = new ArrayList<Object>();
		if (srcPos + length >= src.length) {
			System.out.println("�������");
		} else {

			for (int i = srcPos; i <= srcPos + length; i++) {
				list.add(src[i]);
			}
		}
		if (destPos + length >= dest.length) {
			System.out.println("�������");
		} else {

			for (int j = destPos; j <= destPos + length; j++) {
				dest[j] = list.get(j - destPos);
			}
		}
		for (Object object : dest) {
			System.out.println(object);
		}

	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Bianchengti5 bianchengti5 = new Bianchengti5();
		bianchengti5.arraycopy();
	}
}
