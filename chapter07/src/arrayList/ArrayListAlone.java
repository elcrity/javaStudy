package arrayList;

import java.util.ArrayList;

import array.Student;

public class ArrayListAlone {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		
		student.add(new Student(1001,"James"));
		student.add(new Student(1002,"Tomas"));
		student.add(new Student(1003,"Edward"));
		
		for(int i = 0; i<student.size(); i++) {
			Student person = student.get(i);
			person.showStudentInfo();
		}
		
		for(Student person2 : student) {
			person2.showStudentInfo();
		}

	}

}
