package iteratorPractice;

import java.util.HashSet;
import java.util.Set;

public class setRemoveDuplicates {

	public static void main(String[] args) {
		
		
		
		Set<student> s = new HashSet<>();
		s.add(new student("Shyaam", 1));
		s.add(new student("Athish", 1));
		s.add(new student("Elupi", 2));
		//s.add(new student("Shyaam", 2));

		
		System.out.println(s);
		
	}

}
