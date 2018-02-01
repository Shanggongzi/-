package java111;

import java.util.Scanner;

//* * * * *
//* * * *
//* * *
//* *
//*
public class Bianchengti1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

}
