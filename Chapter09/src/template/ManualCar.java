package template;

public class ManualCar extends Car{
	@Override
	public void drive() {
		System.out.println("운전자가 운전");
		System.out.println("운전자가 핸들 조작");
}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지");
		
	}

	@Override
	public void wiper() {
		System.out.println("운전자가 와이퍼 속도 조절");
		
	}
}