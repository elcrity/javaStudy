package test;

public class SuperLevelT extends PlayerLevelT {
	
	@Override
	public void runT() {
		System.out.println("���� �޸��ϴ�");
		
	}

	@Override
	public void jumpT() {
		System.out.println("���� �����մϴ�");
		
	}

	@Override
	public void turnT() {
		System.out.println("�߱�");
		
	}

	@Override
	public void showLevelT() {
		System.out.println("====�����====");
	}
}
