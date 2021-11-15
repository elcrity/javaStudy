package lambda;

@FunctionalInterface
public interface MyNumber {
	int getMax(int num1, int num2);
//	람다식은 하나의 메서드만 구현한 인터페이스에서 사용 가능
//	int add(int num1, int num2);
}
