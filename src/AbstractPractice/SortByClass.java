package AbstractPractice;

import java.util.Comparator;

public class SortByClass implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id - o2.id;
	}

}

//	@Override
//	public int compare(SortByClass o1, SortByClass o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
