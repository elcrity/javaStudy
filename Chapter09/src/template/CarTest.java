package template;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("====�������� ����====");
		AICar aiCar = new AICar();
		aiCar.run();
		
		System.out.println("====�������� ����====");
		ManualCar mCar = new ManualCar();
		mCar.run();

	}

}
