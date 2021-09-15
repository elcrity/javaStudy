package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임임"));
		hashSet.add(new String("박박"));
		hashSet.add(new String("홍홍"));
		hashSet.add(new String("강강"));
		hashSet.add(new String("강강"));
		
		System.out.println(hashSet);

	}

}
