package xuexi;

public class shuzu {
	public static void main(String[] args) {

		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1, 0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };

		for (int k = 0; k < 10; k++) {
			int j = 0;
			for (int i = 0; i <= score.length - 1; i++) {
				if (score[i] == k) {
					j++;
				}
			}
			System.out.println(j);
		}
	}
}