package test;

public class MainBoardT {

	public static void main(String[] args) {
		PlayerT player = new PlayerT();
		player.playT(1);
		
		AdvancedLevelT aPlayer = new AdvancedLevelT();
		player.upgradeLevel(aPlayer);
		player.playT(2);
		
		SuperLevelT sPlayer = new SuperLevelT();
		player.upgradeLevel(sPlayer);
		player.playT(3);

	}

}
