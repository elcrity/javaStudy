package template;

public class AICar extends Car {
	
	@Override
	public void drive() {
		System.out.println("���� ����");
		System.out.println("������ ������ȯ");
}

	@Override
	public void stop() {
		System.out.println("������ ����");
	}
	
	@Override
	public void wiper() {
		System.out.println("������ �ӵ� �ڵ� ����");
	}
	
	
}