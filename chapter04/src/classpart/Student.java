package classpart;

public class Student {
	int StudentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);//�̸� �ּ� ���
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student Ahn = new Student();
		Ahn.studentName = "������";
		
		System.out.println(Ahn.studentName);
		System.out.println(Ahn.getStudentName());
	}
}

