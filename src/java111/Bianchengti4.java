package java111;
//String������һ��������toCharArray()��

//�÷�����string����������ã����ڽ�һ���ַ������char�����飬
//����ǩ��Ϊ:char[] toCharArray()��
//���дһ������int lastIndexOf(String s,char c)��
//�����һ���ַ���string�е�һ�γ��ֵ�λ�ã�����������
//�����string��û������ַ����򷵻�-1��

public class Bianchengti4 {
	public static int lastIndexOf(String s, char c) {
		int i = s.lastIndexOf(c, s.length() - 1);
		char[] C = s.toCharArray();
		for (int j = 0; j < C.length; j++) {
			System.out.println(C[j]);
			if (C[j] == c) {
				System.out.println("-------");
			}

		}

		return i;

	}

	public static void main(String[] args) {
		System.out.println(Bianchengti4.lastIndexOf("sdfsd", 's'));
	}

}
