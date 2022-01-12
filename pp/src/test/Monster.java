package test;

public class Monster {
	private int mLv;
	private String mName;
	private int mHp;
	private int mMp;
	private int mMaxHp;
	private int mMaxMp;
	private int mExp;
	private int mAtk;
	private int mDef;
	private int mHit;
	private int mAc;
	
	Monster(){}
	
	Monster(String name, int lv, int hp, int mp, int exp, int atk, int def, int hit, int ac){
		this.mName = name;
		this.mLv = lv;
		this.mHp = hp;
		this.mMaxHp = hp;
		this.mExp = exp;
		this.mAtk = atk;
		this.mDef = def;
		this.mHit = hit;
		this.mAc = ac;
		this.mMp = mp;
		this.mMaxMp = mp;
	}
	
	private static Monster instance = new Monster();
	
	
	public static Monster getInstance() {
		if(instance == null) {
			instance = new Monster();
		}
		return instance;
	}
	
	public static void setInstance(Monster monster) {
		instance = monster;
	}
	
	public int getmLv() {
		return mLv;
	}

	public void setmLv(int mLv) {
		this.mLv = mLv;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getmHp() {
		return mHp;
	}

	public void setmHp(int mHp) {
		this.mHp = mHp;
	}

	public int getmMp() {
		return mMp;
	}

	public void setmMp(int mMp) {
		this.mMp = mMp;
	}

	public int getmMaxHp() {
		return mMaxHp;
	}

	public void setmMaxHp(int mMaxHp) {
		this.mMaxHp = mMaxHp;
	}

	public int getmMaxMp() {
		return mMaxMp;
	}

	public void setmMaxMp(int mMaxMp) {
		this.mMaxMp = mMaxMp;
	}

	public int getmExp() {
		return mExp;
	}

	public void setmExp(int mExp) {
		this.mExp = mExp;
	}

	public int getmAtk() {
		return mAtk;
	}

	public void setmAtk(int mAtk) {
		this.mAtk = mAtk;
	}

	public int getmDef() {
		return mDef;
	}

	public void setmDef(int mDef) {
		this.mDef = mDef;
	}

	public int getmHit() {
		return mHit;
	}

	public void setmHit(int mHit) {
		this.mHit = mHit;
	}

	public int getmAc() {
		return mAc;
	}

	public void setmAc(int mAc) {
		this.mAc = mAc;
	}
	
	public void showMonsterInfo() {
		System.out.print("이름 : " + this.getmName());
		System.out.print(" Lv : " + this.getmLv());
		System.out.println("  exp : " + this.getmExp());
		System.out.print("체력 : " + this.getmHp()+ "/" + this.getmMaxHp());
		System.out.println("  마나 : " + this.getmMp()+ "/" +  this.getmMaxMp());
		System.out.println("Atk : " + this.getmAtk() + "  Def : " + this.getmDef());
		System.out.println("Hit : " + this.getmHit() + "  AC : " + this.getmAc());
		System.out.println();
	}
	
	public Monster getMobInfo(Monster mob) {
		return mob;
	}
}


