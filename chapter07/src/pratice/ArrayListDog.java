package pratice;

import java.util.ArrayList;

public class ArrayListDog {

	public static void main(String[] args) {
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("1��", "11"));
		dog.add(new Dog("2��", "222"));
		dog.add(new Dog("3��", "33"));
		dog.add(new Dog("4��", "444"));
		dog.add(new Dog("5��", "55"));
		
		for(int i = 0; i <dog.size(); i++) {
			Dog anm = dog.get(i);
			System.out.println(anm.showDogInfo());
		}
		
		for(Dog anm2 : dog)
			System.out.println(anm2.showDogInfo());
	}

}
