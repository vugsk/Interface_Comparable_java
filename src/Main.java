import AnimalTask.*;

import java.util.Arrays;

public class Main {
	private void task1()
	{
		System.out.println("Task 1");
		AnimalComparator animalComparator = new AnimalComparator();
		Animals[] animals = new Animals[2];
		animals[0] = new Cat("Cat1", 56);
		animals[1] = new Dog("Dog1", 42);
		
		Arrays.sort(animals);
		System.out.println("Sort name: " + animals[0].toString() + animals[1]);
		
		Arrays.sort(animals, animalComparator);
		System.out.println("Sort age: " + animals[0].toString() + animals[1]);
	}
	
	public static void main(String[] args) {
	
	
	}
}