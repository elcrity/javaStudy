package map.hashmap;

import collection.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
			MemberHashMap memberHashMap = new MemberHashMap();
			
			Member lee = new Member(1001,"ÀÌ");
			Member son = new Member(1002,"¼Õ");
			Member park = new Member(1003,"¹Ú");
			Member hong = new Member(1004,"È«");
			
			memberHashMap.addMember(lee);
			memberHashMap.addMember(son);
			memberHashMap.addMember(park);
			memberHashMap.addMember(hong);
			
			memberHashMap.showAllMember();
			
			memberHashMap.removeMember(1003);
			
			memberHashMap.showAllMember();
	}

}
