package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("����"));
		hashSet.add(new String("�ڹ�"));
		hashSet.add(new String("ȫȫ"));
		hashSet.add(new String("����"));
		hashSet.add(new String("����"));
		
		System.out.println(hashSet);

	}

}
