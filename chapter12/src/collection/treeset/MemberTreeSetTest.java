package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet mTreeSet = new MemberTreeSet();
		
		Member Lee = new Member(1003,"ÀÌ");
		Member Park = new Member(1001,"¹Ú");
		Member Kim = new Member(1002,"±è");
		
		mTreeSet.addMember(Lee);
		mTreeSet.addMember(Park);
		mTreeSet.addMember(Kim);
		mTreeSet.showAllMember();
		
		Member Hong = new Member(1003,"È«");
		mTreeSet.addMember(Hong);
		mTreeSet.showAllMember();

	}

}
