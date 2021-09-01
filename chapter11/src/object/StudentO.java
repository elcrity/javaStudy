package object;

public class StudentO {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public StudentO(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentName + "," + studentID;
	}
	
	
	
}


