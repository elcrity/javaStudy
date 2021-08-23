package array;

public class Objectcopy1 {

	public static void main(String[] args) {
		Book[] book1 = new Book[3];
		Book[] book2 = new Book[3];
		
		book1[0] = new Book("태백산맥","조정래");
		book1[1] = new Book("데미안","헤르만 헤세");
		book1[2] = new Book("어떻게 살 것인가","유시민");
		book2[0] = new Book();
		book2[1] = new Book();
		book2[2] = new Book();
		
		//얕은복사
		//System.arraycopy(book1, 0, book2, 0, 3);
		
		for(int i = 0; i<book1.length; i++) {
			book2[i].setAuthor(book1[i].getAuthor());
			book2[i].setBookName(book1[i].getBookName());
		}
		
		for(int i = 0; i<book2.length; i++) {
			book2[i].showBookInfo();
		}
		
		book1[0].setAuthor("박완서");
		book1[0].setBookName("나목");
		
		System.out.println("1--------------------1");
		for(int i = 0; i<book1.length; i++) {
			book1[i].showBookInfo();
		}
		
		System.out.println("2--------------------2");
		for(int i = 0; i<book2.length; i++) {
			book2[i].showBookInfo();
		}

	}

}
