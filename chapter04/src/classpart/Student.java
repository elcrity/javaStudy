package classpart;

public class Student {
	int StudentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);//이름 주소 출력
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student Ahn = new Student();
		Ahn.studentName = "안현수";
		
		System.out.println(Ahn.studentName);
		System.out.println(Ahn.getStudentName());
	}
}

