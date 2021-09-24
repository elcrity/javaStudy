package map.treemap;

import collection.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member park = new Member(1003, "��");
		Member lee = new Member(1001, "��");
		Member hong = new Member(1004, "ȫ");
		Member son = new Member(1002, "��");
		
		memberHashMap.addMember(park);
		memberHashMap.addMember(lee);
		memberHashMap.addMember(hong);
		memberHashMap.addMember(son);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}

}
