package innerclass;

class Outer2{
	int a = 1;
	
	//익명 내부 클래스, Runnable인터페이스 생성
	Runnable getRunnable(int i) {
		int num = 100;
	
		return new Runnable() {

			@Override
			public void run() {
				//num = 200;
				//i = 10;
				
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	//익명 내부 클래스를 변수에 대dlq
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수" + a);
		}
		
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		out.runner.run();

	}

}
