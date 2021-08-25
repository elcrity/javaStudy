package test;

public class PlayerT {
	private PlayerLevelT level;
	
	public PlayerT() {
		level = new BeginnerLevelT();
		level.showLevelT();
	}
	
	public PlayerLevelT getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevelT level) {
		this.level = level;
		level.showLevelT();
	}
	
	public void playT(int count) {
		level.go(count);
	}
}
