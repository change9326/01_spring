package design_pattern.factory;

public class AnimalDemo {

	public static void main(String[] args) {
		//我想买只猫
		Cat cat = new Cat();
		cat.eat();
		//我想要只狗
		Dog dog = new Dog();
		dog.eat();
		
		System.out.println("=========");
		
		Cat cat2 = (Cat) AnimalFactory.createAnimal("cat");
		cat2.eat();
		
		Dog dog2 = (Dog) AnimalFactory.createAnimal("dog");
		dog2.eat();
	}

}
