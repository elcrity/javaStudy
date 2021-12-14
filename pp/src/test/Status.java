package test;

import java.io.Serializable;

public class Status implements Serializable{
	private static int lv;
	private String name;
	private static int hp;
	private static int mp;
	private static int maxHp;
	private static int maxMp;
	private static String job;
	private static int exp;
	private static int atk;
	private static int def;
	private static int hit;
	private static int ac;
	
	Status(){}
	
//	Status(int lv, String name, int maxHp, int maxMp) {
//		this.lv = lv;
//		this.name = name;
//		this.maxHp = maxHp;
//		this.maxMp = maxMp;
//		this.hp = maxHp;
//		this.mp = maxMp;
//	}
	
	public void MakeCha(String name) {
		lv = 1; exp = 0;
		this.name = name; job = "초보자";
		maxHp = 200;
		maxMp = 100;
		hp = maxHp;
		mp = maxMp;
		atk = 10; def = 1;
		hit = 5; ac = 10;
	}
	
	public void showStatus() {
		System.out.print("이름 : " + this.getName());
		System.out.println("  직업 : " + this.getJob());
		System.out.print("Lv : " + this.getLv());
		System.out.println("  exp : " + this.getExp());
		System.out.print("체력 : " + this.getHp()+ "/" + this.getMaxHp());
		System.out.println("  마나 : " + this.getMp()+ "/" +  this.getMaxMp());
		System.out.println("Atk : " + this.getAtk() + "  Def : " + this.getDef());
		System.out.println("Hit : " + this.getHit() + "  AC : " + this.getAc());
	}
	
	public Status getStatus(Status stat) {
		return stat;
	}

	public static int getHit() {
		return hit;
	}

	public static void setHit(int hit) {
		Status.hit = hit;
	}

	public static int getAc() {
		return ac;
	}

	public static void setAc(int ac) {
		Status.ac = ac;
	}

	public static int getExp() {
		return exp;
	}

	public static void setExp(int exp) {
		Status.exp = exp;
	}

	public static int getAtk() {
		return atk;
	}

	public static void setAtk(int atk) {
		Status.atk = atk;
	}

	public static int getDef() {
		return def;
	}

	public static void setDef(int def) {
		Status.def = def;
	}

	public static String getJob() {
		return job;
	}

	public static void setJob(String job) {
		Status.job = job;
	}

	public static void setLv(int lv) {
		Status.lv = lv;
	}

	public static void setHp(int hp) {
		Status.hp = hp;
	}

	public static void setMp(int mp) {
		Status.mp = mp;
	}

	public static void setMaxHp(int maxHp) {
		Status.maxHp = maxHp;
	}

	public static void setMaxMp(int maxMp) {
		Status.maxMp = maxMp;
	}

	public int getLv() {
		return lv;
	}

	public String getName() {
		return name;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public int getMaxMp() {
		return maxMp;
	}

	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}
	
	
}
