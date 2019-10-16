package design_pattern.factory;

public class AnimalFactory {

	private AnimalFactory(){}
	//对修改关闭、对扩展开放
	public static Dog createDog(){
		return new Dog();
	}
	public static Cat createCat(){
		return new Cat();
	}
	
	//简单工厂设计模式（负担太重、不符合开闭原则）
	public static Animal createAnimal(String name){
		if ("cat".equals(name)) {
			return new Cat();
		}else if ("dog".equals(name)) {
			return new Dog();
		}else if ("cow".equals(name)) {
			return new Dog();
		}else{
			return null;
		}
	}
}
