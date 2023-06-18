package iteratorPractice;

import java.util.ArrayList;

public class class1 {
	
	public ArrayList<student> loadData(){
		
		ArrayList<student> s = new ArrayList<>();
		s.add(new student("Shyaam", 1));
		s.add(new student("Athish", 1));
		s.add(new student("Elupi", 2));
		s.add(new student("Shyaam", 2));
		
//		Set<student> s = new HashSet<>();
//		s.add(new student("Shyaam", 1));
//		s.add(new student("Athish", 1));
//		s.add(new student("Elupi", 2));
//		//s.add(new student("Shyaam", 2));
		
		return s;
	}

}
