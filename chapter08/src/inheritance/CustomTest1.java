package inheritance;

public class CustomTest1 {

	public static void main(String[] args) {
		Customer Lee = new Customer(10010,"�̼���");
//		Lee.setCustomerID(10010);
//		Lee.setCustomerName("�̼���");
		Lee.bonusPoint = 1000;
		System.out.println(Lee.showCustomerInfo());
		
		VIPCustomer Kim = new VIPCustomer(10020,"������",1111);
//		Kim.setCustomerID(10020);
//		Kim.setCustomerName("������");
		Kim.bonusPoint = 10000;
		System.out.println(Kim.showVIPInfo());
		

	}

}
