package xuexi;

public class Simulator {
	public void playSound(AbstractAnimal animal) {
		animal = new Dog();// 上转型对象,因为这是外部传入的参数，已经定义好了，无需重新定义
		// Dog dog=new Dog();
		// animal=dog
		animal.cry();
		System.out.println(animal.getAnimalName());
	}

}
