package design_pattern.abstract_factory;

public class CatFactory extends AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}

}
