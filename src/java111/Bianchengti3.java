package java111;

//����һ��ѧ���ĳɼ�int[] score={80,45,60,100,89,92,93,...}
//���������ɼ��У�100�֣�90-99��80-89��ѧ������
public class Bianchengti3 {
	public static void main(String[] args) {
		int[] score = { 80, 45, 60, 100, 89, 92, 93, 88, 77 };
		int q = 0;
		int w = 0;
		int e = 0;
		int r = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 100) {

				q++;

			} else if (score[i] >= 90 && score[i] < 100) {

				w++;
			} else if (score[i] >= 80 && score[i] < 90) {
				e++;

			} else {
				r++;
			}

		}
		System.out.println("100�ֵ�����Ϊ" + q);
		System.out.println("90-90�ֵ�����Ϊ" + w);
		System.out.println("80-89�ֵ�����Ϊ" + e);
		System.out.println("����80�ֵ�����Ϊ" + r);

	}

}
