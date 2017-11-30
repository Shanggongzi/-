package xuexi;

public class Teacher extends AbstractPerson implements IChi {

	@Override
	public void Speak() {
		// TODO Auto-generated method stub
		System.out.println("我会读");
	}

	@Override
	String getAnimalName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void teach() {
		System.out.println("我在教学");
	}

	public static void main(String[] args) {
		AbstractPerson person = new Teacher();
		person.cry();
		System.out.println(person.getAnimalName());
		Teacher teacher = (Teacher) person;
		teacher.teach();
		teacher.setName("dd");
		System.out.println(teacher.getAnimalName());
		teacher.Eat();
		IChi chi = new Teacher();
		chi.Eat();// 站在接口的角度上
		System.out.println(yachi);

	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("我在吃饭");
	}

}
