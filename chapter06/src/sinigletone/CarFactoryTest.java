package sinigletone;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory Fac = CarFactory.getcInstance(); //������ CarFactory cinstance �ϳ�
		Car car1 = Fac.createCar();
		Car car2 = Fac.createCar();
		System.out.println(car1.getCarNum());
		System.out.println(car2.getCarNum());
		
	}

}
