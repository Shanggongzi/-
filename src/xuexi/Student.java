package xuexi;

import java.util.Scanner;

public class Student {
	String name;
	int age;
	String className;
	String gendar;

	public String GetName() {
		return name;
	}

	public int GetAge() {
		return age;
	}

	public String GetGendar() {
		return gendar;
	}

	public Student() {
	}

	public Student(String name, int age, String className, String gendar) {
		this.name = name;
		this.age = age;
		this.className = className;
		this.gendar = gendar;

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ������");
		int num = scanner.nextInt();
		Student[] students = new Student[num];
		for (int i = 0; i < students.length; i++) {
			System.out.println("����������");
			String name = scanner.next();
			System.out.println("����������");
			int age = scanner.nextInt();
			System.out.println("�������Ա�");
			String gendar = scanner.next();
			System.out.println("������༶");
			String className = scanner.next();
			Student student = new Student(name, age, className, gendar);
			students[i] = student;
		}
		for (Student j : students) {
			System.out.println(j);
		}

		// for (int i = 0; i < students.length; i++) {
		// Student student = students[i];
		// System.out.println(student.toString());
		//
		// }

		while (true) {

			System.out.println("����ѧ����Ϣ����ѯ");
			System.out.println("����ѧ����������ѯ��1");
			System.out.println("����ѧ����������ѯ��2");
			System.out.println("����ѧ���༶����ѯ��3");
			System.out.println("�˳���������0");

			System.out.println("�������ѯ��ʽ��0 1 2 3");
			int num1 = scanner.nextInt();
			if (num1 == 0) {
				System.out.println("�˳���������");
				break;
			}
			switch (num1) {
			case 1:
				System.out.println("����������");
				String nameSearch = scanner.next();
				boolean isnamesearchfound = false;
				for (int j = 0; j < students.length; j++) {
					Student student = students[j];
					String name = student.GetName();
					if (nameSearch.equals(name)) {
						System.out.println(student);
						isnamesearchfound = true;
					}

				}
				if (isnamesearchfound == false) {
					System.out.println("û�ҵ�");
				}

				break;
			case 2:
				System.out.println("����������");
				int agesearch = scanner.nextInt();
				boolean isagesearchfound = false;
				for (int j = 0; j < students.length; j++) {
					Student student = students[j];
					int age = student.GetAge();
					if (agesearch == age) {
						System.out.println(student);
						isnamesearchfound = true;
					}

				}

				if (isagesearchfound == false) {
					System.out.println("û�ҵ�");
				}

				break;
			case 3:
				System.out.println("�������Ա�");
				String gendarsearch = scanner.next();
				boolean isgendarfound = false;
				for (int j = 0; j < students.length; j++) {

					Student student = students[j];
					String gendar = student.GetGendar();
					if (gendarsearch.equals(gendar)) {
						System.out.println(student);
						isgendarfound = true;
					}

				}
				if (isgendarfound == false) {
					System.out.println("û�ҵ�");
				}

				break;
			default:
				System.out.println("�������ˣ���û��");
				break;
			}
		}

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", className=" + className + ", gendar=" + gendar + "]";
	}

}
