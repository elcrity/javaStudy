package arrayList;

public class StudenTest {

	public static void main(String[] args) {
		Student Lee = new Student(1001,"Lee");
		Lee.addSubject("국어", 90);
		Lee.addSubject("수학", 70);
		
		Student Kim = new Student(1001,"Kim");
		Kim.addSubject("국어", 50);
		Kim.addSubject("수학", 70);
		Kim.addSubject("과학", 90);
		
		Lee.showStudentInfo();
		Kim.showStudentInfo();
		
		System.out.println(Lee.subjectList.size());

	}

}
