package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student Lee = new Student();
		Lee.setStudentName("������");
		System.out.println(Student.serialNum);
		System.out.println(Lee.studentName + "�й� : " + Lee.studentID);
		
		Student Son = new Student();
		Son.setStudentName("�ռ���");
		System.out.println(Student.serialNum);
		System.out.println(Son.studentName + "�й� : " + Son.studentID);
		

	}

}
