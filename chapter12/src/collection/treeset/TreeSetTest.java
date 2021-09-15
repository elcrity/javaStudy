package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("È«");
		treeSet.add("°­");
		treeSet.add("¹Ú");
		
		for(String str : treeSet) {
			System.out.println(str);
		}

	}

}
