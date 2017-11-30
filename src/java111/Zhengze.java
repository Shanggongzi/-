package java111;

public class Zhengze {

	public static void main(String[] args) {
		// 正则表达式只是规定的一个格式，判断字符串符不符合这个格式，并不关心其他的方面，有3种方法：match，replaceall以及split
		// 其中split切割的是数组，需要字符串的数组类型来接收，打印的时候需要遍历。
		// match是指定义的字符串是否符合定义的正则表达式的格式，replaceall是指把符合正则表达式的部分替换成你想要的东西。
		String regex = "\\d+";
		String string1 = "sfsdfs335drgdgd875gwe232";
		String str = string1.replaceAll(regex, "*");
		System.out.println(str);
		String regex1 = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+";
		String string2 = "11111@qq.com.cn.gov";
		if (string2.matches(regex1)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		String regex2 = "\\d*3\\d*";
		String string3 = "sfsd33535fsfsgd456sfs35gg";
		String[] str1 = string3.split(regex2);
		for (String string : str1) {
			System.out.println(string);
		}
	}
}
