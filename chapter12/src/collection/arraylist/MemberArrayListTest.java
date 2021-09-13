package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memList = new MemberArrayList();
		Member Lee = new Member(1001,"ÀÌ");
		Member Son = new Member(1002,"¼Õ");
		Member Park = new Member(1003,"¹Ú");
		Member hong = new Member(1004,"È«");
		
		memList.addMember(Lee);
		memList.addMember(Son);
		memList.addMember(Park);
		memList.addMember(hong);
		
		memList.showAllMember();
		
		memList.removeMember(hong.getMemberId());
		memList.showAllMember();
		
		memList.instertMember(hong, 2);
		memList.showAllMember();

	}

}
