package test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Status stat = Status.getInstance();
		World world = new World();
		Monster[] mob = new Monster[5];
		Map map = new Map("��");
		mob[0] = new Monster("������", 1, 50, 0, 10, 3, 1, 5, 5);
		mob[2] = new Monster("����", 1, 30, 0, 5, 2, 1, 0, 6);
		map.showmMob(mob[2]);
		map.insertMob(0, mob[0]);
		map.insertMob(2, mob[2]);
		map.showAllMob(2);
		
		
		
//		Status stat = new Status();
//		Map world = new Map();
		int act = 0;
		int dice = 0;
		dice = Dice.RollDice(20);
		System.out.println(dice);
		
		
		
		while(true) {
			System.out.println("1. ����");
			System.out.println("2. �ҷ�����");
			System.out.println("3. ����");
			System.out.println();
			act = sc.nextInt();
			switch(act) {
			case 1 :
				String name;
				System.out.println("����");
				while(true) {
					System.out.print("�̸� �Է� : ");
					name = sc.next();
					if(name.length() > 1 && name.length() < 9) {
						break;
					}else {
						System.out.println("�̸��� Ȯ���� �ּ���. �̸��� 2�ں��� ũ�� 8�ں��� �۾ƾ� �մϴ�.");
					}
				}
				stat.MakeCha(name);
				stat.setHp(10);
				stat.setInstance(stat);
				stat.showStatus();
				
				System.out.println("==============");
				world.makeWorld();
//				while(true) {
//					System.out.println("====================");
//					System.out.println("1. �̵��ϱ�");
//					System.out.println("2.");
//					System.out.println("3.");
//					System.out.println("====================");
//					act = sc.nextInt();
//					switch(act) {
//					case 1 :
////						System.out.println(world.getMapName(map[0]) + " ");
//					}
//				}
//				break;
			case 2 :
				System.out.println(stat.getLv());
			System.out.println(stat.getName());
			System.out.println("HP : " + stat.getHp());
			System.out.println(stat.getMp());
			System.out.println(stat.getMaxHp());
			System.out.println(stat.getMaxMp());
				break;
			case 3 :
				System.exit(0);
			}
//			if(input == 1) {
//				String name;
//				System.out.println("����");
//				while(true) {
//					System.out.print("�̸� �Է� : ");
//					name = sc.next();
//					if(name.length() > 1 && name.length() < 9) {
//						break;
//					}else {
//						System.out.println("�̸��� Ȯ���� �ּ���. �̸��� 2�ں��� ũ�� 8�ں��� �۾ƾ� �մϴ�.");
//					}
//				}
//				stat.MakeCha(name);
//				stat.showStatus();	
//				Map.makeWorld();
//				
//			}else if(input == 2) {
//				System.out.println("�ҷ�����");
////				System.out.println(cha.getLv());
////				System.out.println(cha.getName());
////				System.out.println(cha.getHp());
////				System.out.println(cha.getMp());
////				System.out.println(cha.getMaxHp());
////				System.out.println(cha.getMaxMp());
//			}else if(input == 3) {
//				break;
//			}
		}	
	}
}
