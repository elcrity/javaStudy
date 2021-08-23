package polymorphism;
import java.util.ArrayList;


class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void sleep() {
		System.out.println("����� ���� ��ϴ�.");
	}
	
	public void readbook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �Ƚ��ϴ�.");
	}
	public void sleep() {
		System.out.println("ȣ���̰� ���� ��ϴ�.");
	}
	public void huting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void slep() {
		System.out.println("�������� ���� ��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ������ ��� �ϴ��� ���ϴ�.");
	}
}

public class AnimalTest{
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	public static void main(String[]args) {
		AnimalTest Test = new AnimalTest();
		Test.addAnimal();
		System.out.println("���� ������ �ٿ� ĳ����");
		Test.testCasting();
	
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList){
			ani.move();
			//ani.sleep : animal�ν��Ͻ����� sleep �޼ҵ尡 ��� ������ ����
		}
		
	}
	
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) { // Human -> ���� : �������� �ʴ� �� ���, ���� ���
				Human h = (Human)ani; // Human -> ���� : ������ ����
				h.readbook();
				h.sleep();
			}else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.huting();
				t.sleep();
			}else if(ani instanceof Eagle) {
			Eagle e = (Eagle)ani;
				e.flying();
				e.slep();
			}
			else {
				System.out.println("�������� �ʴ� ��");
			}	
		}
	}
}
