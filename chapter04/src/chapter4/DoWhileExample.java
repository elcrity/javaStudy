package chapter4;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, num = 1;
		
		do {
			System.out.println(num + "¹ø ½ÇÇà");
			sum +=num;
			num++;
		}while(num<11);
		System.out.println(sum);

	}

}
