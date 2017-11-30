package xuexi;

public class shuzu2 {
	public static void main(String[] args) {
		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1, 0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
		int m = 0;
		int n = 0;
		for (int i = 0; i < score.length - 1; i++) {
			if (score[i] % 2 == 0) {
				m++;
			} else {
				n++;
			}
		}
		System.out.println("奇数个数为：" + m);
		System.out.println("偶数个数为：" + n);
	}

}