package xuexi;

import java.util.Arrays;

public class Leijia {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 6, 7, 56 };
		int m = Arrays.binarySearch(num, 56);
		System.out.println(m);
		int[] n = Arrays.copyOf(num, 10);
		for (int i : n) {
			System.out.println(i);
		}
	}
}