package test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Status stat = Status.getInstance();
		World world = new World();
		Monster[] mob = new Monster[5];
		Map map = new Map("숲");
		mob[0] = new Monster("슬라임", 1, 50, 0, 10, 3, 1, 5, 5);
		mob[2] = new Monster("여우", 1, 30, 0, 5, 2, 1, 0, 6);
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
			System.out.println("1. 시작");
			System.out.println("2. 불러오기");
			System.out.println("3. 종료");
			System.out.println();
			act = sc.nextInt();
			switch(act) {
			case 1 :
				String name;
				System.out.println("시작");
				while(true) {
					System.out.print("이름 입력 : ");
					name = sc.next();
					if(name.length() > 1 && name.length() < 9) {
						break;
					}else {
						System.out.println("이름을 확인해 주세요. 이름은 2자보다 크고 8자보다 작아야 합니다.");
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
//					System.out.println("1. 이동하기");
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
//				System.out.println("시작");
//				while(true) {
//					System.out.print("이름 입력 : ");
//					name = sc.next();
//					if(name.length() > 1 && name.length() < 9) {
//						break;
//					}else {
//						System.out.println("이름을 확인해 주세요. 이름은 2자보다 크고 8자보다 작아야 합니다.");
//					}
//				}
//				stat.MakeCha(name);
//				stat.showStatus();	
//				Map.makeWorld();
//				
//			}else if(input == 2) {
//				System.out.println("불러오기");
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
