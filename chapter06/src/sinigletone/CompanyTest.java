package sinigletone;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCom1 = Company.getInstance();
		Company myCom2 = Company.getInstance();
		
		System.out.println(myCom1 == myCom2);
		

	}

}
