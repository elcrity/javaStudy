package sinigletone;

public class CarFactory {
	
	private static CarFactory cinstance = new CarFactory();
	
	CarFactory(){}
	
	public static CarFactory getcInstance() {
		if(cinstance == null) {
			cinstance = new CarFactory();
		}
		return cinstance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
		
	}

}
