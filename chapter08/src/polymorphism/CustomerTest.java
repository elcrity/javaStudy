package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer Lee = new Customer();
		Lee.setCustomerID(10010);
		Lee.setCustomerName("이순신");
		Lee.bonusPoint = 1000;
		
		System.out.println(Lee.showCustomerInfo());
		
		Customer Kim = new VIPCustomer(10020, "김유신", 12345);
		Kim.bonusPoint = 1000;
		
		System.out.println(Kim.showCustomerInfo());
		System.out.println("=============할인율과 포인트 계싼=============");
		
		int price = 10000;
		int kimPrice = Kim.calcPrice(price);
		int leePrice = Lee.calcPrice(price);
		
		System.out.println(Lee.getCustomerName() + " 님이" + leePrice + "원 지불하셨습니다.");
		System.out.println(Lee.showCustomerInfo());
		System.out.println(Kim.getCustomerName() + " 님이" + kimPrice + "원 지불하셨습니다.");
		System.out.println(Kim.showCustomerInfo());

	}

}
