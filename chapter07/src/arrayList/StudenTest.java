package arrayList;

public class StudenTest {

	public static void main(String[] args) {
		Student Lee = new Student(1001,"Lee");
		Lee.addSubject("����", 90);
		Lee.addSubject("����", 70);
		
		Student Kim = new Student(1001,"Kim");
		Kim.addSubject("����", 50);
		Kim.addSubject("����", 70);
		Kim.addSubject("����", 90);
		
		Lee.showStudentInfo();
		Kim.showStudentInfo();
		
		System.out.println(Lee.subjectList.size());

	}

}
