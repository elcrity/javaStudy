package template;

public class ManualCar extends Car{
	@Override
	public void drive() {
		System.out.println("�����ڰ� ����");
		System.out.println("�����ڰ� �ڵ� ����");
}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� ����");
		
	}

	@Override
	public void wiper() {
		System.out.println("�����ڰ� ������ �ӵ� ����");
		
	}
}