package sorting;

import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식 선택.");
		System.out.println("B : 버블 정렬 ");
		System.out.println("H : 힙 정렬 ");
		System.out.println("Q : 빠른 정렬 ");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		}else if(ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		}else if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}else {
			System.out.println("선택 오류");
			return;
		}
		
		int[] arr = new int[10];
		sort.ascending();
		sort.descending();
		sort.description();
	}

}
