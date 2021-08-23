package cooperation;

public class Taxi {
	String carNumber;
	int passengerCount;
	int money;
	
	public Taxi(String carNumber) {
		this.carNumber = carNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(carNumber + "의 금일 총 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");
	}

}
