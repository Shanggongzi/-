package xuexi;

import java.util.Scanner;

public class chengji {

	public static void main(String[] args) {

		int[] num = new int[5];
		int sum = 0;
		System.out.println("������ɼ�");
		for (int i = 0; i < num.length; i++) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			num[i] = scanner.nextInt();
			sum += num[i];

		}
		System.out.println(sum / num.length);
	}
}