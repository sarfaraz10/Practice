package iteratorPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class student1 {

	public int id;
	public String name;

	public student1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != getClass())
			return false;
		student1 other = (student1) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "student1 [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args)  throws NegitiveException {
		
		Set<student1> s = new HashSet<>();
		s.add(new student1(1, "Athish"));
		s.add(new student1(1, "Shyaam"));
		s.add(new student1(2, "Shyaam"));
		s.add(new student1(3, "Deepak"));
		s.add(new student1(4, "Surya"));
		s.add(new student1(1, "Elupi"));
		
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(4,2,1,5, -6));
		Iterator<Integer> itr = list.iterator();
		int sum = 0;
		while (itr.hasNext()) {
			int a = itr.next();
			if (a >= 0) {
				sum = sum + a;
			}else {
				System.out.println(sum);
				throw new NegitiveException("negitive");
				}
		}
		
	
	}

}
