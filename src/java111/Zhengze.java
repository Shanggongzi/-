package java111;

public class Zhengze {

	public static void main(String[] args) {
		// ������ʽֻ�ǹ涨��һ����ʽ���ж��ַ����������������ʽ���������������ķ��棬��3�ַ�����match��replaceall�Լ�split
		// ����split�и�������飬��Ҫ�ַ������������������գ���ӡ��ʱ����Ҫ������
		// match��ָ������ַ����Ƿ���϶����������ʽ�ĸ�ʽ��replaceall��ָ�ѷ���������ʽ�Ĳ����滻������Ҫ�Ķ�����
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
