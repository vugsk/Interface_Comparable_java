package StudentsTask;

public class Student implements Comparable<Student> {
	private String name;
	private int averageScore;
	
	public Student(String name, int averageScore) {
		this.name = name;
		this.averageScore = averageScore;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return "{" + this.name + " " + this.averageScore + "}";
	}
	
	public String getName() {
		return name;
	}
	
	public int getAverageScore() {
		return averageScore;
	}
	
}
