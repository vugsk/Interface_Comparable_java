package AnimalTask;

public abstract class Animals implements Comparable<Animals>
{
	private String name;
	private int age;
	
	Animals(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	abstract void makeSound();
	
	@Override
	public int compareTo(Animals o)
	{
		return this.name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return "{ " + name + " " + age + " }";
	}
	
	String getName() { return this.name; }
	int getAge() { return this.age; }
	
}
