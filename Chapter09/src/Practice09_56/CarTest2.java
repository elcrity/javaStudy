package Practice09_56;
import java.util.ArrayList;

public class CarTest2 {

	public static void main(String[] args) {
		ArrayList<Car2> carList = new ArrayList<Car2>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		for(Car2 car : carList) {
			car.run();
			System.out.println("================");
		}

	}

}
