package chapter4;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for(i = 2; i<10; i++) {
			for(j = 1; j<10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}
		
	}

}
