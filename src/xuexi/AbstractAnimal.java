package xuexi;

abstract class AbstractAnimal {
	abstract void cry();

	abstract String getAnimalName();

	String name;

	public void setName(String name) {
		this.name = name;
	}

}
