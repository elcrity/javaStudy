package practicQ5;

public class beanCoffee {
	int money;
	
	public void takeout(String name) {
		if(name == "아메리카노") {
			this.money += Menu.beanCofAmericano;
		}else if(name == "라떼") {
			this.money += Menu.beanCofLatte;
		}else {
			System.out.println("없는메뉴");
		}		
	}
	
	public void showSell() {
		System.out.println("콩커피 판매액은" + money + "입니다");
	}
}
