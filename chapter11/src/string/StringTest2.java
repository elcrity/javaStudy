package string;

public class StringTest2 {

	public static void main(String[] args) {
		String javaStr = new String("java"); //new String으로 생성시 final char[]로 생성
		String andStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(andStr);
		
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));// 두 문자열 을 합치면 그냥 이어지는게 아니라 새로운 문자열이 생성
	}

}
