package chapter3;

public class OperatorEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fatherAge = 55;
		int motherAge = 44;
		
		char ch;
		ch = (fatherAge < motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		int num = 10;
		boolean isEven;
		isEven = ((num % 2) == 0)? true : false;
		System.out.println(isEven);
	}

}
