package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		CompleteCalc calc = new CompleteCalc();
//		Calc calc = new Calc(); Calc에서 섢언한 add~divide는 사용 가능, CompleteCalc에서 선언한 showInfo사용 불가능
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.square(num1));
		
		calc.showInfo();
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));//정적 메서드는 인터페이스에서 직접 호출, calc.total(arr);은 참조 불가능으로 에러 발생

	}

}
