package chapter4;

public class practiceQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line = 9;
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
			if(i < line/2) {
				space -= 1;
				start += 2;
			}else {
				space +=1;
				start -=2;
			}
			System.out.println();
		}
		
	}

}
