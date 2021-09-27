package map.q6;

import java.util.HashMap;

public class CarFactory {
	private static CarFactory Fac = new CarFactory();
	private HashMap<String, Car> cMap = new HashMap<>();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(Fac == null) 
			Fac = new CarFactory();
		return Fac;
	}
	
	public Car createCar(String name) {
		if(cMap.containsKey(name)) {
			return cMap.get(name);
		}
		Car car = new Car();
		cMap.put(name, car);
		return car;
	}

}
//Ʈ��,��,�ؽ�, �� �ٽ� �ѹ� ����