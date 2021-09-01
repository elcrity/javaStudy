package object;


class Student{
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentID + "," + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentID == std.studentID)
				return true;
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentID;
	}
	
}

public class EqualsTest {
	public static void main(String[] args) {
		Student chan = new Student(100,"����");
		Student chan2 = chan;
		Student bab = new Student(100,"����");
		
		if(chan == chan2) {
			System.out.println("chan�� chan2�� �ּҴ� �����ϴ�");
		}
		else
			System.out.println("chan�� chan2�� �ּҴ� �ٸ��ϴ�");
		
		if(chan.equals(chan2))
			System.out.println("chan�� chan2�� ����");
		else
			System.out.println("chan�� chan2�� �������� ����");
		
		if(chan == bab) {
			System.out.println("chan�� chan2�� �ּҴ� �����ϴ�");
		}
		else
			System.out.println("chan�� chan2�� �ּҴ� �ٸ��ϴ�");
		
		if(chan.equals(bab))
			System.out.println("chan�� chan2�� ����");
		else
			System.out.println("chan�� chan2�� �������� ����");
		
		System.out.println("chan�� hashCode : " + chan.hashCode());
		System.out.println("chan2�� hashCode : " + chan2.hashCode());
		System.out.println("chan2�� hashCode : " + bab.hashCode());
		
		System.out.println("chan�� ���� �ּҰ� : " + System.identityHashCode(chan));
		System.out.println("chan2�� ���� �ּҰ� : " + System.identityHashCode(chan2));
		System.out.println("chan2�� ���� �ּҰ� : " + System.identityHashCode(bab));
	}
}