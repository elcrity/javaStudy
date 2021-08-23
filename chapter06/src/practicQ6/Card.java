package practicQ6;

public class Card {
	private static Card card = new Card();
	
	public static Card getCard(){
		if(card == null) {
			card = new Card();
		}
		return card;
	}
	
	public NewCard createCard() {
		NewCard newcard = new NewCard();
		return newcard;
	}
	


}
