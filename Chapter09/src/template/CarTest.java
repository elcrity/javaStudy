package template;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("====자율주행 차량====");
		AICar aiCar = new AICar();
		aiCar.run();
		
		System.out.println("====수동운전 차량====");
		ManualCar mCar = new ManualCar();
		mCar.run();

	}

}
