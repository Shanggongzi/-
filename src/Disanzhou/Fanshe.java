package Disanzhou;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Fanshe {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("Disanzhou.Person");
		Constructor constructor = clazz.getConstructor(String.class, int.class);
		System.out.println(constructor);
		// Person person = (Person) constructor.newInstance("zhangsan", 21);
		Object per = constructor.newInstance("ss", 22);
		// Object per = clazz.newInstance();
		Method method1 = clazz.getMethod("getName");
		String invoke = (String) method1.invoke(per);
		System.out.println(invoke);
		Method method = clazz.getMethod("setName", String.class);
		method.invoke(per, "zhangsan");
		System.out.println(per);
		System.out.println(per.getClass().getName());

	}
}
