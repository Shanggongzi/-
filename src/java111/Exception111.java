package java111;

public class Exception111 {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 0;
		try {
			// 需要被检测的代码（可能出现异常，也可能不出现）
			// int result = num1 / num2;
			int result = div(num1, num2);
			System.out.println(result);

		}
		// catch (ArithmeticException e) {
		// // 捕获异常后处理异常
		// System.out.println("ArithmeticException");
		// System.out.println(e);
		// e.printStackTrace();
		// }
		// catch (ArrayIndexOutOfBoundsException e) {
		// // 捕获异常后处理异常
		// System.out.println("ArrayIndexOutOfBoundsException");
		// // e.printStackTrace();
		// System.out.println(e);
		// }
		catch (Exception e) {
			System.out.println("Exception");
			// e.printStackTrace();
			System.out.println(e);
		} finally {
			// 一定会被执行的代码（不管你这个异常出没出现）
			System.out.println("-----");
		}

		System.out.println("**********");
	}

	private static int div(int num1, int num2) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		int[] array = new int[2];
		// String str = null;
		// System.out.println(str.charAt(0));
		array[2] = 9;
		return num1 / num2;
	}

}
// try catch最好在main方法中用，上面部分就直接写方法；
// 对于异常的捕获可以有多个catch，但是随着在main方法中的调用，一旦发现某行代码与某个catch相匹配，就直接抛出异常，
// 然后跳过后面所有的异常，如果有finally，直接进入finally里面，不在进行其他catch的匹配
// 所以写异常处理的时候一定把范围小的写在前面，如果把范围大的写在前面会直接报出异常，但是并不知道是哪个地方异常。
