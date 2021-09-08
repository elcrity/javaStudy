package generics;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		 powderPrinter.setMaterial(new Powder());
		 Powder powder = powderPrinter.getMaterial();
		 System.out.println(powderPrinter);
		 
		 GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		 
		 plasticPrinter.setMaterial(new Plastic());
		 Plastic plastic = plasticPrinter.getMaterial();
		 System.out.println(plasticPrinter);
		 
		 //Material을 상속받은 클래스만 사용 가능
		 //GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
	}

}
