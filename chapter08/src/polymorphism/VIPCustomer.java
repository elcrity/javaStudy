package polymorphism;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return (int)((1-saleRatio)*price);
	}
	
	public int getAgentID() {
		return agentID;
	}

	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�";
	}
}
