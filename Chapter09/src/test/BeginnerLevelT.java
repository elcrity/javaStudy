package test;

public class BeginnerLevelT extends PlayerLevelT {
	
	@Override
	public void runT() {
		System.out.println("천천히 달립니다");
	}

	@Override
	public void jumpT() {
		System.out.println("못뜀");
		
	}

	@Override
	public void turnT() {
		System.out.println("못돔");
		
	}

	@Override
	public void showLevelT() {
		System.out.println("====비기너====");
		
	}

}
