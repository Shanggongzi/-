package xuexi;

public class Simulator {
	public void playSound(AbstractAnimal animal) {
		animal = new Dog();// ��ת�Ͷ���,��Ϊ�����ⲿ����Ĳ������Ѿ�������ˣ��������¶���
		// Dog dog=new Dog();
		// animal=dog
		animal.cry();
		System.out.println(animal.getAnimalName());
	}

}
