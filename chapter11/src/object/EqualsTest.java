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
		Student chan = new Student(100,"찬밥");
		Student chan2 = chan;
		Student bab = new Student(100,"찬밥");
		
		if(chan == chan2) {
			System.out.println("chan과 chan2의 주소는 같습니다");
		}
		else
			System.out.println("chan과 chan2의 주소는 다릅니다");
		
		if(chan.equals(chan2))
			System.out.println("chan과 chan2는 동일");
		else
			System.out.println("chan과 chan2는 동일하지 않음");
		
		if(chan == bab) {
			System.out.println("chan과 chan2의 주소는 같습니다");
		}
		else
			System.out.println("chan과 chan2의 주소는 다릅니다");
		
		if(chan.equals(bab))
			System.out.println("chan과 chan2는 동일");
		else
			System.out.println("chan과 chan2는 동일하지 않음");
		
		System.out.println("chan의 hashCode : " + chan.hashCode());
		System.out.println("chan2의 hashCode : " + chan2.hashCode());
		System.out.println("chan2의 hashCode : " + bab.hashCode());
		
		System.out.println("chan의 실제 주소값 : " + System.identityHashCode(chan));
		System.out.println("chan2의 실제 주소값 : " + System.identityHashCode(chan2));
		System.out.println("chan2의 실제 주소값 : " + System.identityHashCode(bab));
	}
}
