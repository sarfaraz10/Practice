package groupingInStreams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class group {
	public static void main(String[] args) {
		
		Set<Emoloyee> set = new HashSet<>();
		set.add(new Emoloyee(1, "Shyaam", "Lamp"));
		set.add(new Emoloyee(2, "Surya", "Java"));
		set.add(new Emoloyee(3, "Lakshmi Priya", "Testing"));
		set.add(new Emoloyee(4, "Athish", "Java"));
		
		//Map<String, String > emp1 = new HashMap<>();
		
		set.stream().collect(Collectors.groupingBy(t -> t.getDepartment(),
				Collectors.groupingBy(t -> t.getName()))).forEach((t, u) -> System.out.println(t +":"+u));
	}

}
