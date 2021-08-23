package pratice;

public class Q3 {

	public static void main(String[] args) {
		int[] num = {2,4,6,8,10};
		int total = 0;
		
		for(int i = 0; i<num.length; i++){
			total += num[i];
		}
		
		System.out.println("2부터 10까지 짝수의 합은 " + total + "입니다");
	}

}
