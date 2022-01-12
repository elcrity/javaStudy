package test;

import java.io.Serializable;

public class Status implements Serializable{
	private int lv;
	private String name;
	private int hp;
	private int mp;
	private int maxHp;
	private int maxMp;
	private String job;
	private int exp;
	private int atk;
	private int def;
	private int hit;
	private int ac;
	
	private static Status instance = new Status();
	Status(){}
	
	public static Status getInstance() {
		if(instance == null) {
			instance = new Status();
		}
		return instance;
	}
	
	public static void setInstance(Status status) {
		instance = status;
	}
	
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
		System.out.println();
	}
	
	public Status getStatus(Status stat) {
		return stat;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def+Dice.RollDice(20);
	}

	public void setDef(int def) {
		this.def = def;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
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
