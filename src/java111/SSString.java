package java111;

public class SSString {
	public static void main(String[] args) {
		String string = "java andorid";
		System.out.println(string.charAt(3));
		System.out.println(string.substring(2));
		System.out.println(string.substring(5, 8));
		System.out.println(string.concat("and"));
		System.out.println(string.contains(" "));
		System.out.println(string.indexOf("d"));
		System.out.println(string.indexOf('n', 2));
		System.out.println(string.indexOf("and", 5));
		System.out.println(string.indexOf("and", 6));
		System.out.println(string.lastIndexOf('a'));
		System.out.println(string.lastIndexOf("and"));
		System.out.println(string.lastIndexOf('n', 5));
		System.out.println(string.lastIndexOf('a', 5));
		System.out.println(string.charAt(5));
		char[] array = { 'j', 'A', 'v', 'a' };
		String string2 = new String(array);
		System.out.println(string2);
		char[] charArray = string2.toCharArray();
		for (char c : charArray) {
			System.out.print(c + " ");

		}
		System.out.println(string.replace('a', 'b'));
		String[] aStrings = string.split(" ");// 在输入的字符处断开，字符消失，分成数组中的元素
		for (String string3 : aStrings) {
			System.out.println(string3);
		}
	}

}
