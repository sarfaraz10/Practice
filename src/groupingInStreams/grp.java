package groupingInStreams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class grp {
	
	public static void main(String[] args) {
		
		Set<Emoloyee> employee = new HashSet<>();
		employee.add(new Emoloyee(1, "Surya", "BFS"));
		employee.add(new Emoloyee(2, "Shyaa,", "Lamp"));
		employee.add(new Emoloyee(1, "Lakshmi Priya", "Testing"));
		employee.add(new Emoloyee(1, "Athish", "Java"));
		employee.add(new Emoloyee(1, "Deepak", "BFS"));
		employee.add(new Emoloyee(1, "Sarfaraz", ".Net"));
		//employee.add(new Emoloyee(1, "Surya", "BFS"));
		
//		Map<String, String> emp1 = new HashMap<>();
		
		employee.stream().collect(Collectors.groupingBy(t -> t.getDepartment(), 
				Collectors.groupingBy(t-> t.getName()))).forEach((t,u) ->System.out.println(t + " " + u));
	}

}
