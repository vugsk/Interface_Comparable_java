package StudentsTask;

import java.util.Comparator;

public class ComparatorStudentScore implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getAverageScore() - o2.getAverageScore();
	}
}
