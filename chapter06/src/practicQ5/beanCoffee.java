package practicQ5;

public class beanCoffee {
	int money;
	
	public void takeout(String name) {
		if(name == "�Ƹ޸�ī��") {
			this.money += Menu.beanCofAmericano;
		}else if(name == "��") {
			this.money += Menu.beanCofLatte;
		}else {
			System.out.println("���¸޴�");
		}		
	}
	
	public void showSell() {
		System.out.println("��Ŀ�� �Ǹž���" + money + "�Դϴ�");
	}
}
