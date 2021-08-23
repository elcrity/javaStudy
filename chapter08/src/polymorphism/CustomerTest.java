package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer Lee = new Customer();
		Lee.setCustomerID(10010);
		Lee.setCustomerName("�̼���");
		Lee.bonusPoint = 1000;
		
		System.out.println(Lee.showCustomerInfo());
		
		Customer Kim = new VIPCustomer(10020, "������", 12345);
		Kim.bonusPoint = 1000;
		
		System.out.println(Kim.showCustomerInfo());
		System.out.println("=============�������� ����Ʈ ���=============");
		
		int price = 10000;
		int kimPrice = Kim.calcPrice(price);
		int leePrice = Lee.calcPrice(price);
		
		System.out.println(Lee.getCustomerName() + " ����" + leePrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(Lee.showCustomerInfo());
		System.out.println(Kim.getCustomerName() + " ����" + kimPrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(Kim.showCustomerInfo());

	}

}
