package polymorphism;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �Ƚ��ϴ�.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
}

public class AnimalTest1{
	public static void main(String[]args) {
		AnimalTest1 Test = new AnimalTest1();
		Test.moveAnimal(new Human());
		Test.moveAnimal(new Tiger());
		Test.moveAnimal(new Eagle());
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}