package java111;

import java.util.ArrayList;

//2��ʵ�ֺ���public String[] toArray(List<String> list)��
//���в���list��Ԫ������ΪString�ַ���
public class Zuoye {
	public String[] toArray(ArrayList<String> list) {

		String[] str = list.toArray(new String[list.size()]);
		for (int i = 0; i < str.length; i++) {
			str[i] = list.get(i);
		}
		return str;
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("sd");
		list.add("gf");
		list.add("fd");
		for (String string : list) {
			System.out.println(string);
		}

		Zuoye zuoye = new Zuoye();
		for (String string : zuoye.toArray(list)) {
			System.out.println(string);
		}

	}
}