package AnimalTask;

public class Dog extends Animals {
	public Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	void makeSound() {
		System.out.println("Woof");
	}
}
