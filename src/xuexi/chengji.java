package xuexi;

import java.util.Scanner;

public class chengji {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		System.out.println("������ɼ�");
		for (int i = 0; i < num.length; i++) {

			num[i] = scanner.nextInt();
			sum += num[i];

		}
		System.out.println(sum / num.length);
	}
}