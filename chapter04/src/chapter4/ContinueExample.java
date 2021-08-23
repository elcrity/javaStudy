package chapter4;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, num;
		for(num=1;num<101;num++) {
			if(num % 3 != 1)
				continue;
			sum += num;
		}
		System.out.println(sum);
		
		/* 3의 배수만 출력
		 * for(num=1;num<101;num++) { if(num % 3 != 0) continue;
		 * System.out.println(num); }
		 */
	}

}
