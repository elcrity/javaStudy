package object;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			return (this.day == date.day && this.month == date.month && this.year == date.year);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return day + month * 100 + year *10000;
	}
}

public class MydateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(1,9,2021);
		MyDate date2 = new MyDate(1,9,2021);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());

	}

}