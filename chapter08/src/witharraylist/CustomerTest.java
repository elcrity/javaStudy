package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer Lee = new Customer(10010, "ÀÌ¾¾");
		Customer Shin = new Customer(10020, "½Å¾¾");
		Customer Hong = new GoldCustomer(10030, "È«¾¾");
		Customer Youl = new GoldCustomer(10040, "À²¾¾");
		Customer Kim = new VIPCustomer(10050, "±è¾¾", 11223);
		
		customerList.add(Lee);
		customerList.add(Shin);
		customerList.add(Hong);
		customerList.add(Youl);
		customerList.add(Kim);
		
		System.out.println("=====°í°´Á¤º¸ Ãâ·Â=====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("======ÇÒÀÎÀ², º¸³Ê½º °è»ê======");
		int price = 10000;
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerName() + "´ÔÀÌ " +  customer.calcPrice(price) + "¿ø ÁöºÒÇÏ¼Ì½À´Ï´Ù.");
			System.out.println(customer.getCustomerName() + "´ÔÀÇ Æ÷ÀÎÆ®´Â " +  customer.bonusPoint + "ÀÔ´Ï´Ù.");
		}

	}

}
