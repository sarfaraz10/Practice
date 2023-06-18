package AbstractPractice;

import java.util.Objects;

public class Student implements Comparable<Student>{
	
	public String name;
	public int id;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != getClass())
			return false;
		Student other = (Student)obj;
		return id == other.id;
				
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
		//return this.id - o.id;
	}

//	@Override
//	public int compare(Student o1, Student o2) {
//		return o1.id -o2.id;
//	}

}
