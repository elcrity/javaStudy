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
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; //�ܺ� Ŭ������ �ν��Ͻ� ������ ��� �Ұ���
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		}
		
		static void sTest() {
			//num += 10; inNum += 10; //�ܺ�, ���� Ŭ������ �ν��Ͻ� ������ ��� �Ұ���
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		}
	}
	
}



public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("���� ����Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println("���� ����Ŭ���� ���� �޼��� ȣ��");
		sInClass.sTest();

	}

}
