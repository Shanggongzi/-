package java111;

public class Exception111 {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 0;
		try {
			// ��Ҫ�����Ĵ��루���ܳ����쳣��Ҳ���ܲ����֣�
			// int result = num1 / num2;
			int result = div(num1, num2);
			System.out.println(result);

		}
		// catch (ArithmeticException e) {
		// // �����쳣�����쳣
		// System.out.println("ArithmeticException");
		// System.out.println(e);
		// e.printStackTrace();
		// }
		// catch (ArrayIndexOutOfBoundsException e) {
		// // �����쳣�����쳣
		// System.out.println("ArrayIndexOutOfBoundsException");
		// // e.printStackTrace();
		// System.out.println(e);
		// }
		catch (Exception e) {
			System.out.println("Exception");
			// e.printStackTrace();
			System.out.println(e);
		} finally {
			// һ���ᱻִ�еĴ��루����������쳣��û���֣�
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
// try catch�����main�������ã����沿�־�ֱ��д������
// �����쳣�Ĳ�������ж��catch������������main�����еĵ��ã�һ������ĳ�д�����ĳ��catch��ƥ�䣬��ֱ���׳��쳣��
// Ȼ�������������е��쳣�������finally��ֱ�ӽ���finally���棬���ڽ�������catch��ƥ��
// ����д�쳣�����ʱ��һ���ѷ�ΧС��д��ǰ�棬����ѷ�Χ���д��ǰ���ֱ�ӱ����쳣�����ǲ���֪�����ĸ��ط��쳣��
