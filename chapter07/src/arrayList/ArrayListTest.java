package arrayList;
import java.util.ArrayList;

import array.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "상텍쥐페리"));
		
		for(int i = 0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("향상된for");
		for(Book book2 : library) {
			book2.showBookInfo();
		}
	}

}
