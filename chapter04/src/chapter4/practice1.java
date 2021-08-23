package chapter4;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 90;
		char grade;
		
		if(score < 60) {
			grade = 'F';
		}else if(score < 70) {
			grade = 'D';
		}else if(score < 80) {
			grade = 'C';
		}else if(score < 90) {
			grade = 'B';
		}else{
			grade = 'A';
		}
		System.out.println(grade);

	}

}
