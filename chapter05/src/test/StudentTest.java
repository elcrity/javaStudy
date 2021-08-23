package test;

import hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = 이상원;  //studentName 이 private으로 선언
		
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}

}
