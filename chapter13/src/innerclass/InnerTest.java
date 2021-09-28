package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
		//static int sInNum = 200;
		
		void inTest() {
			System.out.println("outclass num = " + num + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
			System.out.println("outclass snum = " + sNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
		}
		
//		static void sTest() {
//		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}



public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();

	}

}
