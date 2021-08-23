package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		
		System.out.println(Student1.getSerialNum());
		
		Student1 Lee = new Student1();
		Lee.setStudentName("이지원");
		System.out.println(Student1.getSerialNum());
		System.out.println(Lee.studentName + "학번 : " + Lee.studentID);
		
		Student1 Son = new Student1();
		Son.setStudentName("손수정");
		System.out.println(Student1.getSerialNum());
		System.out.println(Son.studentName + "학번 : " + Son.studentID);
		
	}

}
