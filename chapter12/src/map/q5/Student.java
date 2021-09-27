package map.q5;
public class Student {
	String id;
	String name;
	
	public Student(String Num, String Name) {
		this.id = Num;
		this.name = Name;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(id);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.id == id) {
				return true;
			}
			else 
				return false;
		}
		
		return false;
	}



	@Override
	public String toString() {
		return id+" "+name;
	}

	

}
