package chapter4;

public class BreakExmple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , sum = 0;
		for(num = 0; ; num++) {
			sum += num;
			if(sum >= 500)
				break;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
