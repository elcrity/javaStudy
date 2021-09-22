package map.hashmap;

import collection.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
			MemberHashMap memberHashMap = new MemberHashMap();
			
			Member lee = new Member(1001,"��");
			Member son = new Member(1002,"��");
			Member park = new Member(1003,"��");
			Member hong = new Member(1004,"ȫ");
			
			memberHashMap.addMember(lee);
			memberHashMap.addMember(son);
			memberHashMap.addMember(park);
			memberHashMap.addMember(hong);
			
			memberHashMap.showAllMember();
			
			memberHashMap.removeMember(1003);
			
			memberHashMap.showAllMember();
	}

}
