package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030,"EA", 103);
		vc.bonusPoint =10000;
		int price = 10000;
		
		System.out.println(vc.calcPrice(price));

	}

}
