package pratice;

public class EnhancedDog {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		
		dog[0]= new Dog("1��", "11");
		dog[1]= new Dog("2��", "22");
		dog[2]= new Dog("3��", "33");
		dog[3]= new Dog("4��", "44");
		dog[4]= new Dog("5��", "55");
		
		for(int i = 0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		for(Dog d : dog) {
			System.out.println(d.showDogInfo());
		}

	}

}
