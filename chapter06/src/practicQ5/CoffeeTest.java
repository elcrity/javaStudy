package practicQ5;

public class CoffeeTest {

	public static void main(String[] args) {
		Person Lee = new Person(5000, "�̾�");
		Person Kim = new Person(6000, "�达");
		
		starCoffee starcoffee = new starCoffee();
		beanCoffee beancoffee = new beanCoffee();
		
		Lee.buyStarCoffe(starcoffee, "�Ƹ޸�ī��");
		Kim.buyBeanCoffe(beancoffee, "��");
		
		Lee.showInfo();
		Kim.showInfo();
		starcoffee.showSell();
		beancoffee.showSell();

	}

}
