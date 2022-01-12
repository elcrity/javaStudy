package test;

public class Map extends World {
	Monster m[] = new Monster[5];
	
	Map(String name) {
		this.mapName = name;
	}
	
	public void showmMob(Monster monster) {
	monster.showMonsterInfo();
	}
	
	public void showAllMob(int num) {
		System.out.print("이름 : " + m[num].getmName());
		System.out.print(" Lv : " + m[num].getmLv());
		System.out.println("  exp : " + m[num].getmExp());
		System.out.print("체력 : " + m[num].getmHp()+ "/" +m[num].getmMaxHp());
		System.out.println("  마나 : " + m[num].getmMp()+ "/" +  m[num].getmMaxMp());
		System.out.println("Atk : " + m[num].getmAtk() + "  Def : " +m[num].getmDef());
		System.out.println("Hit : " + m[num].getmHit() + "  AC : " + m[num].getmAc());
		System.out.println();
	}
	
	public void insertMob(int num, Monster mob) {
		m[num] = mob;
	}
	
	public Monster[] getM() {
		return m;
	}

	public void setM(Monster[] m) {
		this.m = m;
	}
}
