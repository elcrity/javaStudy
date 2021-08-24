package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer();//추상 클래스는 인스턴스화 불가능, 메소드가 전부 구현되지 않았기때문
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();

	}

}
