package pratice;

import java.util.ArrayList;

public class ArrayListDog {

	public static void main(String[] args) {
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("1번", "11"));
		dog.add(new Dog("2번", "222"));
		dog.add(new Dog("3번", "33"));
		dog.add(new Dog("4번", "444"));
		dog.add(new Dog("5번", "55"));
		
		for(int i = 0; i <dog.size(); i++) {
			Dog anm = dog.get(i);
			System.out.println(anm.showDogInfo());
		}
		
		for(Dog anm2 : dog)
			System.out.println(anm2.showDogInfo());
	}

}
