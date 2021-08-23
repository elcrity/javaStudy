package practicQ6;

public class NewCard {
	static int serialNum = 100000;
	int cardNum;
	
	public NewCard() {
		serialNum++;
		cardNum = serialNum;
	}
	
	public void getNum() {
		System.out.println(cardNum);
	}

}
