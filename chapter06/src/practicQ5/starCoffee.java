package practicQ5;

public class starCoffee {
	int coffeeName;
	int money;
	
	public void takeout(String name) {
		if(name == "�Ƹ޸�ī��") {
			this.money += Menu.starCofAmericano;
		}else if(name == "��") {
			this.money += Menu.starCofLatte;
		}else {
			System.out.println("���¸޴�");
		}
	}
	
	public void showSell() {
		System.out.println("��Ŀ�� �Ǹž���" + money + "�Դϴ�");
	}
}
