package practicQ5;

public class Person {
	public String name;
	public int money;
	
	public Person(int money, String name){
		this.name = name;
		this.money = money;
		
	}
	
	public void buyStarCoffe(starCoffee scoffee, String name) {
		if(name == "�Ƹ޸�ī��") {
			this.money -= Menu.starCofAmericano;
		}else if(name == "��") {
			this.money -= Menu.starCofLatte;
		}
		scoffee.takeout(name);
	}
	public void buyBeanCoffe(beanCoffee bcoffee, String name) {
		if(name == "�Ƹ޸�ī��") {
			this.money -= Menu.beanCofAmericano;
		}else if(name == "��") {
			this.money -= Menu.beanCofLatte;
		}
		bcoffee.takeout(name);
	}
	
	public void showInfo() {
		System.out.println(name + "�� �ܾ���" + money);
	}
}
