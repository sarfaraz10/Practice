package iteratorPractice;

import java.util.Objects;

public class student implements Comparable<student>  {
	
	public String name;
	public int id;
	
	public student(String name, int id) {
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
		student other = (student)obj;
		return id == other.id;
	}



	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + "]";
	}



	@Override
	public int compareTo(student o) {
		if(this.id == o.id)
			return this.name.compareTo(o.name);
		return this.id - o.id;
	}
	

}
