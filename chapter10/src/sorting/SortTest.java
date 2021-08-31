package sorting;

import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException {
		System.out.println("���� ��� ����.");
		System.out.println("B : ���� ���� ");
		System.out.println("H : �� ���� ");
		System.out.println("Q : ���� ���� ");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		}else if(ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		}else if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}else {
			System.out.println("���� ����");
			return;
		}
		
		int[] arr = new int[10];
		sort.ascending();
		sort.descending();
		sort.description();
	}

}
