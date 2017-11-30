package xuexi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zhuanhuan {
	public static void main(String[] args) {

		Student student1 = new Student("zhangsan", 11, "1", "nan");
		Student student2 = new Student("lisi", 12, "1", "nv");
		Student student3 = new Student("wangwu", 13, "1", "nan");
		Set<Student> set = new HashSet<Student>();
		set.add(student1);
		set.add(student2);
		set.add(student3);
		for (Student student : set) {
			System.out.println(student);
		}
		System.out.println("------------");
		Student[] students = new Student[set.size()];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		List<Student> list = Arrays.asList(students);
		for (Student student : list) {
			System.out.println(student);// Êı×é×ª»»list
		}

	}
}
