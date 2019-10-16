package design_pattern.abstract_factory;

public class DogFactory extends AnimalFactory {

	private DogFactory(){}
	
	public static AnimalFactory newFactory(){
		return new DogFactory();
	}
	
	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
