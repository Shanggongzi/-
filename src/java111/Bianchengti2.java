package java111;

//��дһ��������s=a+aa+aaa+a...a������a��һ����������a=2��
//��ô��s=2+22+222+2222...��ֵ���÷�����Ҫ��������
//����һ����������a���ڶ������������ж��ٸ�������5�֣�
public class Bianchengti2 {
	public static int fangfa(int a, int num) {
		int s = 0;
		int k = 0;
		for (int j = 0; j < num; j++) {
			k = k * 10 + a;
			System.out.println("k�Ĵ�СΪ" + k);
			s += k;
		}

		return s;
	}

	public static void main(String[] args) {
		System.out.println(Bianchengti2.fangfa(2, 4));
	}

}
