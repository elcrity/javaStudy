package polymorphism;
import java.util.ArrayList;


class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void sleep() {
		System.out.println("사람이 잠을 잡니다.");
	}
	
	public void readbook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다.");
	}
	public void sleep() {
		System.out.println("호랑이가 잠을 잡니다.");
	}
	public void huting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void slep() {
		System.out.println("독수리가 잠을 잡니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 하늘을 납니다.");
	}
}

public class AnimalTest{
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	public static void main(String[]args) {
		AnimalTest Test = new AnimalTest();
		Test.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		Test.testCasting();
	
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList){
			ani.move();
			//ani.sleep : animal인스턴스에는 sleep 메소드가 없어서 컴파일 오류
		}
		
	}
	
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) { // Human -> 변경 : 지원되지 않는 형 출력, 오류 출력
				Human h = (Human)ani; // Human -> 변경 : 컴파일 에러
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
				System.out.println("지원되지 않는 형");
			}	
		}
	}
}
