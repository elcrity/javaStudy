package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student Lee = new Student();
		Lee.setStudentName("이지원");
		System.out.println(Student.serialNum);
		System.out.println(Lee.studentName + "학번 : " + Lee.studentID);
		
		Student Son = new Student();
		Son.setStudentName("손수정");
		System.out.println(Student.serialNum);
		System.out.println(Son.studentName + "학번 : " + Son.studentID);
		

	}

}
