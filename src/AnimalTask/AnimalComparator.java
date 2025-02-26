package AnimalTask;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animals> {
	@Override
	public int compare(Animals o1, Animals o2) {
		return o1.getAge() - o2.getAge();
	}
}
