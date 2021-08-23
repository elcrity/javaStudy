package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer Lee = new Customer(10010, "�̾�");
		Customer Shin = new Customer(10020, "�ž�");
		Customer Hong = new GoldCustomer(10030, "ȫ��");
		Customer Youl = new GoldCustomer(10040, "����");
		Customer Kim = new VIPCustomer(10050, "�达", 11223);
		
		customerList.add(Lee);
		customerList.add(Shin);
		customerList.add(Hong);
		customerList.add(Youl);
		customerList.add(Kim);
		
		System.out.println("=====������ ���=====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("======������, ���ʽ� ���======");
		int price = 10000;
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerName() + "���� " +  customer.calcPrice(price) + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ����Ʈ�� " +  customer.bonusPoint + "�Դϴ�.");
		}

	}

}
