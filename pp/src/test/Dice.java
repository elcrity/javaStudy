package test;

import java.util.Random;

public class Dice {
	static Random rand = new Random();
	
	public static int RollDice(int num) {
		return rand.nextInt(num);
	}
}
