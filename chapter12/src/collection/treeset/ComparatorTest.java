package collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1 ;
	}
	
}

public class ComparatorTest {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new MyCompare());
		//TreeSet클래스 생성자에 Comparator인터페이스를 구현한 MyCompare 인스턴스를 매개 변수로 집어넣어 재정의된 compare로 작동
		//Mycompare 인스턴스를매개 변수로 집어 넣지 않으면 기존의 compare으로 작동하여 aaa,bbb,ccc 로 생성
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");

		
		System.out.println(set);
	}

}
