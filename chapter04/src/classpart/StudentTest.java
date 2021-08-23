package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student Ahn = new Student();
		Ahn.studentName = "¾È¸ð¾¾";
		System.out.println(Ahn.getStudentName());
		
		Student Park = new Student();
		Park.studentName = "¹Ú¸ð¾¾";
		System.out.println(Park.getStudentName());
		
	}

}
