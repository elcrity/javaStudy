package staticex;

public class Studentcard {
	private static int serialNum = 1000;
	public int studentID;
	public int studentCardID;
	public String studentName;
	public int grade;
	public String address;
	
	public Studentcard() {
		serialNum++;
		studentID = serialNum;
		studentCardID = serialNum+100;
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Studentcard.serialNum = serialNum;
	}
	
	public void showInfo() {
		System.out.println("학번은" + studentID + ", 카드번호는" + studentCardID);
	} 

}