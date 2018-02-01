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

		// 只遍历一次，效率较高。
		int[] counts = new int[10];
		for (int i = 0; i < score.length; i++) {
			switch (score[i]) {

			case 0:
				counts[0]++;

				break;
			case 1:
				counts[1]++;
				break;
			case 2:
				counts[2]++;
				break;
			case 3:
				counts[3]++;
				break;
			case 4:
				counts[4]++;
				break;
			case 5:
				counts[5]++;
				break;
			case 6:
				counts[6]++;
				break;
			case 7:
				counts[7]++;
				break;
			case 8:
				counts[8]++;
				break;
			case 9:
				counts[9]++;
				break;

			default:
				System.out.println("_____________");
				break;
			}
		}
		for (int i : counts) {
			System.out.print(i + " ");
		}
	}
}