package java111;

public class Student222 {
	String name;
	int age;
	String className;

	public Student222(String name, int age, String className) {
		super();
		this.name = name;
		this.age = age;
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student111 [name=" + name + ", age=" + age + ", className=" + className + "]";

	}
}