package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		
		System.out.println(Student1.getSerialNum());
		
		Student1 Lee = new Student1();
		Lee.setStudentName("������");
		System.out.println(Student1.getSerialNum());
		System.out.println(Lee.studentName + "�й� : " + Lee.studentID);
		
		Student1 Son = new Student1();
		Son.setStudentName("�ռ���");
		System.out.println(Student1.getSerialNum());
		System.out.println(Son.studentName + "�й� : " + Son.studentID);
		
	}

}
