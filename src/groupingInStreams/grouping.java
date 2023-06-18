package groupingInStreams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class grouping {
	
	public static void main(String[] args) {
		
		Set<Emoloyee> employee = new HashSet<>();
		employee.add(new Emoloyee(1, "Surya", "Lamp"));
		employee.add(new Emoloyee(2, "Shyaam", "Lamp"));
		employee.add(new Emoloyee(3, "Lakshmi Priya", "Testing"));
		
		//Map<String, String> emp1 = new HashMap<>();
		
		employee.stream().collect(Collectors.groupingBy(t ->t.getDepartment(),
				Collectors.groupingBy(t ->t.getName()))).forEach((t, u) ->System.out.println(t+":"+u));
		
	}

}
