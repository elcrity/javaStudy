package chapter4;

public class PracticeQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j = 1;
		for(i = 2; i<10; i++) {
			for(j = 1; j<10; j++) {
				if(i < j)
					break;
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}
	}

}
