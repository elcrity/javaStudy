package Constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person Kim = new Person();
		Kim.name = "김유신";
		Kim.height = 185.22f;
		Kim.weight = 78.21f;
		
		Person Lee = new Person("이순신", 188.42f, 88.33f);
		
		Kim.showInfo();
		Lee.showInfo();
		
	}

}
