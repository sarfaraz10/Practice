package groupingInStreams;

public class Emoloyee implements Comparable<Emoloyee> {
	
	public int id;
	public String name;
	public String department;
	
	public Emoloyee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "id=" + id ;
	}

	@Override
	public int compareTo(Emoloyee o) {
		return 0;
	}
	
	
	

}
