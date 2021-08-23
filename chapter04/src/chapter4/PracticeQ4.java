package chapter4;

public class PracticeQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line = 4;
		int start = 1;
		int space = line/2 + 1;
		for(int i = 0; i<line; i++) {
			for(int j = 0; j<space; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j<start; j++){
				System.out.print('*');
			}
			for(int j = 0; j< space; j++) {
				System.out.print(' ');
			}
			space -= 1;
			start += 2;
			System.out.println();
		}

	}

}
