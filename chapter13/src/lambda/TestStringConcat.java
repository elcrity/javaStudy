package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);

	}

}
