package template;

public class AICar extends Car {
	
	@Override
	public void drive() {
		System.out.println("자율 주행");
		System.out.println("스스로 방향전환");
}

	@Override
	public void stop() {
		System.out.println("스스로 멈춤");
	}
	
	@Override
	public void wiper() {
		System.out.println("와이퍼 속도 자동 조절");
	}
	
	
}
