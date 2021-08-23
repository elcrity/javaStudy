package practicQ6;

public class CardTest {

	public static void main(String[] args) {
		Card card = Card.getCard();
		NewCard newcard1 = card.createCard();
		NewCard newcard2 = card.createCard();
		
		newcard1.getNum();
		newcard2.getNum();

	}

}
