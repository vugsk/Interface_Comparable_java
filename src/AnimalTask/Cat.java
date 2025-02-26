package AnimalTask;

public class Cat extends Animals {
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	void makeSound() {
		System.out.println("I am a cat");
	}
}
