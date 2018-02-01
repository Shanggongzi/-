package java111;
//String类中有一个方法叫toCharArray()；

//该方法在string对象上面调用，用于将一个字符串变成char的数组，
//方法签名为:char[] toCharArray()；
//请编写一个方法int lastIndexOf(String s,char c)，
//计算出一个字符在string中第一次出现的位置（倒着数），
//如果在string中没有这个字符，则返回-1；

public class Bianchengti4 {
	public static int lastIndexOf(String s, char c) {
		int i = s.lastIndexOf(c, s.length() - 1);
		char[] C = s.toCharArray();
		for (int j = 0; j < C.length; j++) {
			System.out.println(C[j]);
			if (C[j] == c) {
				System.out.println("-------");
			}

		}

		return i;

	}

	public static void main(String[] args) {
		System.out.println(Bianchengti4.lastIndexOf("sdfsd", 's'));
	}

}
