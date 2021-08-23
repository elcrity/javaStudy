package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student James = new Student("제임스", 5000);
		Student Thomas = new Student("토마스", 10000);
		Student Edward = new Student("에드워드", 12500);
		
		Bus bus100 = new Bus(100);
		James.takeBus(bus100);
		James.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		Thomas.takeSubway(subwayGreen);
		Thomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi gyung43 = new Taxi("경기43 1234");
		Edward.takeTaxi(gyung43, 5);
		Edward.showInfo();
		gyung43.showInfo();
	}

}
