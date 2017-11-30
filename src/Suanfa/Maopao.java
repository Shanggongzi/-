package Suanfa;

public class Maopao {
	public static void main(String[] args) {
		int[] a = { 1, 5, 2, 8, 9, 22, 1 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					a[j] = a[j] + a[j + 1]; // 两个数的交换
					a[j + 1] = a[j] - a[j + 1];
					a[j] = a[j] - a[j + 1];
				}
			}
		}

		for (int b : a) {
			System.out.println(b);
		}

	}
}
