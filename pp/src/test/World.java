package test;

public class World{
	String mapName;
	
	
	World() {
	}

	
	public void makeWorld() {
		int i = 0;
		System.out.println("������ �����ϴ� ��");
		World[] map = new World[4];
		map[0] = new World();
		map[0].setMapName("��");
		map[1] = new World();
		map[1].setMapName("����");
		
//		System.out.println("���� ������ �ڶ�� ��");
//		//String name, int lv, int hp, int mp, int exp, int atk, int def, int hit, int ac
//		Monster slime = new Monster("������", 1, 50, 0, 10, 3, 1, 5, 5);
//		Monster fox = new Monster("����", 1, 30, 0, 5, 2, 1, 0, 6);
//		Monster skeleton = new Monster("���̷���", 3 , 150, 0, 30, 10, 2, 3, 3);
//		Monster bear = new Monster("��", 5, 300, 0, 100, 30, 2, 10, 8);
//		
//		System.out.println("���͵��� ����ϴ� ��");
//		map[0].insertMob(0, slime);
//		map[0].insertMob(1, fox);
//		map[0].insertMob(2, bear);
//		
//		map[1].insertMob(0, skeleton);
//		map[1].insertMob(1, slime);
//		System.out.println("���� �����Ϸ�");
//		map[0].m[0].showMonsterInfo();
//		map[0].m[1].showMonsterInfo();
//		map[1].m[0].showMonsterInfo();
//		map[1].m[1].showMonsterInfo();
////		System.out.println(forest.m[0].getmName());
	}

	public static String getMapName(World map) {
		return map.mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}


	
	
}
