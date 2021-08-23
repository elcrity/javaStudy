package practicQ5;

public class CoffeeTest {

	public static void main(String[] args) {
		Person Lee = new Person(5000, "ÀÌ¾¾");
		Person Kim = new Person(6000, "±è¾¾");
		
		starCoffee starcoffee = new starCoffee();
		beanCoffee beancoffee = new beanCoffee();
		
		Lee.buyStarCoffe(starcoffee, "¾Æ¸Þ¸®Ä«³ë");
		Kim.buyBeanCoffe(beancoffee, "¶ó¶¼");
		
		Lee.showInfo();
		Kim.showInfo();
		starcoffee.showSell();
		beancoffee.showSell();

	}

}
