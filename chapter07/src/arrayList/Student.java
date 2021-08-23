package arrayList;

import java.util.ArrayList;

public class Student {
	int studentID;
	String name;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScore();
			System.out.println("�л� " + name +"�� " + s.getName() + " �������� " + s.getScore());
		}
		System.out.println("�л� "  + name + "�� ������" + total + "�Դϴ�.");
	}
}
