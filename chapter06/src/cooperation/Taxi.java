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
		System.out.println(carNumber + "�� ���� �� �°���" + passengerCount + "���̰�, ������" + money + "�Դϴ�.");
	}

}
