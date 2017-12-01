package xuexi;

import java.util.Scanner;

public class yuefen {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入月份");
		int month = scanner.nextInt();
		if (month < 0 || month > 12) {
			return;
		}
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(31);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(30);
			break;
		case 2:
			System.out.println("请输入年份");
			int year = scanner.nextInt();
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				System.out.println(29);
			} else {
				System.out.println(28);
			}
			break;
		default:
			System.out.println("default");
			break;
		}

	}
}
