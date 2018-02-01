package Suanfa;

public class Erfen {

	public static void main(String[] args) {
		int[] num = { 12, 24, 56, 79, 90, 100 };// 前提是数组必须排好序
		int a = suanfa(num, 57);
		System.out.println(a);
	}

	public static int suanfa(int[] num, int key) {

		int start = 0;
		int end = num.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key > num[mid]) {
				start = mid + 1;
			} else if (key < num[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}

		}
		return -1;

	}
}
