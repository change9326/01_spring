package design_pattern.abstract_factory;

public class AnimalDemo {

	public static void main(String[] args) {
		//使用多态：父类引用指向的是子类的对象
		AnimalFactory factory = new CatFactory();
		Cat cat = (Cat) factory.createAnimal();
		cat.eat();
		
		//解决的是CatFactory直接new的问题
		AnimalFactory factory2 = DogFactory.newFactory();
		Dog dog = (Dog) factory2.createAnimal();
		dog.eat();
	}

}
