package java111;

public class Staticaaa {
	int age = 10;
	String name = "DFHF";
	public static int height = 90;

	public static void ceshi() {

		System.out.println(height);
		Staticaaa staticaaa = new Staticaaa();
		System.out.println(staticaaa.age);

	}

	public static void maopao(int[] array) {
		maopaopaixu(array);

	}

	public static void szjh(int[] array, int x, int y) {
		shuzujiaohuan(array, x, y);

	}

	private static void shuzujiaohuan(int[] array, int x, int y) {
		for (int i = 1; i < array.length; i++) {
			System.out.println(array[i]);
		}
		if (x < array.length && y < array.length) {
			System.out.println(array[x]);
			System.out.println(array[y]);
			int temp;
			temp = x;
			x = y;
			y = temp;
			System.out.println(array[x]);
			System.out.println(array[y]);

		} else {
			System.out.println("ÊäÈë´íÎó");
		}
	}

	public static void swap(int x, int y) {
		shuzijiaohuan(x, y);

	}

	private static void shuzijiaohuan(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("xÎª£º" + x);
		System.out.println("yÎª£º" + y);
	}

	private static void maopaopaixu(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					array[j] = array[j] + array[j + 1];
					array[j + 1] = array[j] - array[j + 1];
					array[j] = array[j] - array[j + 1];

				}

			}

		}
	}

	public static void main(String[] args) {
		Staticaaa.ceshi();
		int weight = 70;
		System.out.println(weight);
		int[] array = { 1, 4, 9, 12, 70, 3, 7 };
		Staticaaa.maopao(array);
		for (int k : array) {
			System.out.println(k);
		}
		Staticaaa.swap(25, 32);
		Staticaaa.szjh(array, 2, 3);
	}

}
