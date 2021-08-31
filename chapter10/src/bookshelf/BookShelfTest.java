package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("È£¸ð »çÇÇ¿£½º");
		shelfQueue.enQueue("È£¸ð µ¥¿ì½º");
		shelfQueue.enQueue("ÃÑ±Õ¼è");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
