package xuexi;

import java.util.ArrayList;

public class Text {
	public static void main(String[] args) {

		Student111 student1 = new Student111("zhangsan", 11, "1");
		Student111 student2 = new Student111("lisi", 12, "1");
		Student111 student3 = new Student111("wangwu", 13, "1");
		ArrayList<Student111> list = new ArrayList<Student111>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		// Student111[] student111s = list.toArray(new Student111[list.size()]);
		// for (Student111 student111 : student111s) {
		// System.out.println(student111);
		// System.out.println("-----------");
		// }把list转换成数组形式
		boolean issearchname = false;
		boolean issearrchage = false;
		boolean issearchclassname = false;
		Searchbyname(list, issearchname);

		Searchbyage(list, issearrchage);

		Searchbyclassname(list, issearchclassname);

	}

	private static void Searchbyclassname(ArrayList<Student111> list, boolean issearchclassname) {

		for (int k = 0; k < list.size(); k++) {
			Student111 student = list.get(k);
			if (student.getClassName().equals("12")) {
				System.out.println(list.get(k));
				issearchclassname = true;
			}

		}
		if (issearchclassname == false) {
			System.out.println("没找到");
		}
	}

	private static void Searchbyage(ArrayList<Student111> list, boolean issearrchage) {
		for (int j = 0; j < list.size(); j++) {
			Student111 student = list.get(j);
			if (student.getAge() == 12) {
				System.out.println(list.get(j));
				issearrchage = true;
			}

		}
		if (issearrchage == false) {
			System.out.println("没找到");

		}
	}

	private static void Searchbyname(ArrayList<Student111> list, boolean issearchname) {
		for (int i = 0; i < list.size(); i++) {
			Student111 student = list.get(i);
			if (student.getName().equals("zhangsan")) {
				System.out.println(list.get(i));
				System.out.println("------------");
				issearchname = true;
			}
		}

		if (issearchname == false) {
			System.out.println("没找到");
		}
	}

}