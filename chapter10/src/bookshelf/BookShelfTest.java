package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("ȣ�� ���ǿ���");
		shelfQueue.enQueue("ȣ�� ���콺");
		shelfQueue.enQueue("�ѱռ�");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
