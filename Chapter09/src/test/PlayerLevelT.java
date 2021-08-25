package test;

public abstract class PlayerLevelT {
	public abstract void runT();
	public abstract void jumpT();
	public abstract void turnT();
	public abstract void showLevelT();
	
	public void go(int count) {
		runT();
		for(int i=0; i<count; i++) {
			jumpT();
		}
		turnT();
	}
}
