package chapter4;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank = 1;
		String medalColor;
		
		switch(rank) {
			case 1 : medalColor = "Gold";
					 break;
			case 2 : medalColor = "Silver";
			 		 break;
			case 3 : medalColor = "Bronze";
			 		 break;
			default :
					 medalColor = "No medal";	
		}
		System.out.println(rank + "등의 메달 색깔은 " + medalColor + "입니다.");
	}

}
