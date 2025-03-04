import AnimalTask.*;
import StudentsTask.*;

import java.util.Arrays;


public class Main {
	private static void task1()
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
	
	private static void task2()
	{
		System.out.println("Task 2");
		ComparatorStudentScore comparatorStudentScore = new ComparatorStudentScore();
		Student[] students = new Student[2];
		students[0] = new Student("John", 42);
		students[1] = new Student("Ann", 20);
		
		Arrays.sort(students);
		System.out.println("Sort name: " + students[0].toString() + ' ' + students[1]);
		
		Arrays.sort(students, comparatorStudentScore);
		System.out.println("Sort age: " + students[0].toString() + ' ' + students[1]);
	}
	
	public static void main(String[] args)
	{
		task1();
		task2();
	}
}