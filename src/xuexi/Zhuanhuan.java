package xuexi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zhuanhuan {
	public static void main(String[] args) {

		Student1 student1 = new Student1("zhangsan", 11, "1", "nan");
		Student1 student2 = new Student1("lisi", 12, "1", "nv");
		Student1 student3 = new Student1("wangwu", 13, "1", "nan");
		Set<Student1> set = new HashSet<Student1>();
		set.add(student1);
		set.add(student2);
		set.add(student3);
		for (Student1 student : set) {
			System.out.println(student);
		}
		System.out.println("------------");
		Student1[] students = new Student1[set.size()];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		List<Student1> list = Arrays.asList(students);
		for (Student1 student : list) {
			System.out.println(student);// Êı×é×ª»»list
		}

	}
}
