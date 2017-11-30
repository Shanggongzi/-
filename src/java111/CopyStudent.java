package java111;

import java.util.ArrayList;
import java.util.Scanner;

public class CopyStudent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student222 student1 = new Student222("zhangsan", 11, "1");
		Student222 student2 = new Student222("lisi", 12, "1");
		Student222 student3 = new Student222("wangwu", 13, "1");
		ArrayList<Student222> list = new ArrayList<Student222>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		while (true) {
			System.out.println("请输入数字选择查询方式");
			int num = scanner.nextInt();
			if (num == 0) {
				System.out.println("退出");
				break;
			}
			switch (num) {
			case 1:
				System.out.println("请按照姓名查询");
				boolean issearchname = false;
				Searchbyname(list, issearchname, scanner);
				break;
			case 2:
				System.out.println("请按照年龄查询 ");
				boolean issearrchage = false;
				Searchbyage(list, issearrchage, scanner);
				break;

			case 3:
				System.out.println("请按照班级名查询");

				boolean issearchclassname = false;
				Searchbyclassname(list, issearchclassname, scanner);
				break;
			default:
				System.out.println("不找了，滚");
			}

		}

	}

	private static void Searchbyclassname(ArrayList<Student222> list, boolean issearchclassname, Scanner scanner) {

		String clname = scanner.next();

		for (int k = 0; k < list.size(); k++) {
			Student222 student = list.get(k);
			if (student.getClassName().equals(clname)) {
				System.out.println(list.get(k));
				issearchclassname = true;
			}

		}
		if (issearchclassname == false) {
			System.out.println("没找到");
		}
	}

	private static void Searchbyage(ArrayList<Student222> list, boolean issearrchage, Scanner scanner) {
		int srage = scanner.nextInt();

		for (int j = 0; j < list.size(); j++) {
			Student222 student = list.get(j);

			if (student.getAge() == srage) {
				System.out.println(list.get(j));
				issearrchage = true;
			}

		}
		if (issearrchage == false) {
			System.out.println("没找到");

		}
	}

	private static void Searchbyname(ArrayList<Student222> list, boolean issearchname, Scanner scanner) {

		String srname = scanner.next();
		for (int i = 0; i < list.size(); i++) {
			Student222 student = list.get(i);
			if (student.getName().equals(srname)) {
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
