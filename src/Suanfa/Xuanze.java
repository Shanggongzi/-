package Suanfa;

public class Xuanze {
	public static void main(String[] args) {

		int[] a = { 1, 4, 11, 34, 9, 3, 77 };
		for (int i = 0; i < a.length - 1; i++) {
			int k = i;// 假设一个最小的下标值
			for (int j = i + 1; j < a.length; j++) {// 找到每一次的最小值
				if (a[j] < a[k]) {
					k = j;
				}

			}
			if (k != i) {// 交换最小值下标，使之排好序
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
