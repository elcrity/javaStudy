package test;

public class SuperLevelT extends PlayerLevelT {
	
	@Override
	public void runT() {
		System.out.println("빨리 달립니다");
		
	}

	@Override
	public void jumpT() {
		System.out.println("높이 점프합니다");
		
	}

	@Override
	public void turnT() {
		System.out.println("뒹굴");
		
	}

	@Override
	public void showLevelT() {
		System.out.println("====상급자====");
	}
}
