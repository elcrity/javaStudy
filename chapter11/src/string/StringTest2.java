package string;

public class StringTest2 {

	public static void main(String[] args) {
		String javaStr = new String("java"); //new String���� ������ final char[]�� ����
		String andStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(andStr);
		
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));// �� ���ڿ� �� ��ġ�� �׳� �̾����°� �ƴ϶� ���ο� ���ڿ��� ����
	}

}
