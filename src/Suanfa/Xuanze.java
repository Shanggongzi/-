package Suanfa;

public class Xuanze {
	public static void main(String[] args) {

		int[] a = { 1, 4, 11, 34, 9, 3, 77 };
		for (int i = 0; i < a.length - 1; i++) {
			int k = i;// ����һ����С���±�ֵ
			for (int j = i + 1; j < a.length; j++) {// �ҵ�ÿһ�ε���Сֵ
				if (a[j] < a[k]) {
					k = j;
				}

			}
			if (k != i) {// ������Сֵ�±꣬ʹ֮�ź���
				a[i] = a[i] + a[k];
				a[k] = a[i] - a[k];
				a[i] = a[i] - a[k];
			}
		}

		for (int n : a) {
			System.out.println(n);
		}
	}
}
