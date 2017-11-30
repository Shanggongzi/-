package xuexi;

public class Student111 {
	String name;
	int age;
	String className;

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

	public Student111(String name, int age, String className) {
		this.name = name;
		this.age = age;
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student111 [name=" + name + ", age=" + age + ", className=" + className + "]";
	}

}
