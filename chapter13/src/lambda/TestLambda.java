package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lambda_11");
		showMyString(lambdaStr);
		
		PrintString returnStr = returnString();
		returnStr.showString("hello ");

	}
	
	public static void showMyString(PrintString m) {
		m.showString("hello lambda_22");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s+"world");
		//PrintString str = s -> System.out.println(s+"world");
		//return str;
	}

}
