package interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1/num2;
		else
			return Calc.ERROR;
	}
	
	public int square(int num) {
		if(num != 0)
			return num*num;
		else
			return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc인터페이스 구현");
	}
	
	@Override
	public void description() {
		super.description();
		//System.out.println("정수계산기 구현2"); 인터페이스 메서드에서 구현한 description 출력후 출력
	}

}
