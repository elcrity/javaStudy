package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer Lee = new Customer(10010,"�̼���");
		Lee.bonusPoint = 1000;
		
		Customer Kim = new VIPCustomer(10020,"������",102);
		Kim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(Lee.getCustomerName() + 
				"���� �����ؾ� �ϴ� �ݾ��� " +  Lee.calcPrice(price) + "���Դϴ�.");
		System.out.println(Kim.getCustomerName() + 
				"���� �����ؾ� �ϴ� �ݾ��� " +  Kim.calcPrice(price) + "���Դϴ�.");

	}

}
