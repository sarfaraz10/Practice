package AbstractPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class mainClass {
	
	public static void main(String[] args) {
		
		Set<Student> student = new HashSet<>();
		student.add(new Student("Surya", 1));
		student.add(new Student("Anime", 2));
		student.add(new Student("Rohit", 3));
		student.add(new Student("Surya", 1));
		
		System.out.println(student);
		
		List<Student> stu = new ArrayList<>();
		stu.addAll(student);
		Collections.sort(stu);
		Iterator<Student> itr = stu.iterator();
		while(itr.hasNext()) {
			Student i = itr.next();
			System.out.println(i);
		}
		//Collections.sort(stu, new SortByClass());
		stu.sort(new SortByClass());
		for(Student s1 : stu) {
			System.out.println(s1);
		}
//		Map<Student, Long> s = student.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(s);
		stu.stream().sorted().collect(Collectors.groupingBy(e -> e,Collectors.counting())).forEach((t,u) -> System.out.println(t+ "" + u));
	}
	

}
