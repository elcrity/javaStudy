package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member Kim = new Member(1001, "��");
		Member Lee = new Member(1002, "��");
		Member Park = new Member(1003, "��");
		
		memberHashSet.addMember(Kim);
		memberHashSet.addMember(Lee);
		memberHashSet.addMember(Park);
		memberHashSet.showAllMember();
		
		Member Hong = new Member(1003,"ȫ");
		memberHashSet.addMember(Hong);
		memberHashSet.showAllMember();

	}

}
