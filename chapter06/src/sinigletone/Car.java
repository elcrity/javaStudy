package sinigletone;

public class Car {
	static int serialNum = 10000;
	public int carNum;

	Car(){
		serialNum++;
		carNum = serialNum;
	}
	

	
	public int getCarNum() {
		return carNum;
	}
}
