import java.util.Random;
import java.util.Scanner;

public class VOTGG {
	
	/**
	 * Declare & Initialize System Variables
	 */
	static Scanner in = new Scanner(System.in);
	static Random rand = new Random();
	static String gameExit = "Exit";
	
	static boolean gameRunning = true;
	
	/**
	 * Declare & Initialize Game Variables
	 * TODO: Come up with enemies and boss name ideas
	 */
	static String[] enemies = {};
	static String[] bosses = {};
	static int maxEnemyHP = 60;
	static int enemyAttackPower = 20;
	//static int maxBossHP = 1000;
	//static int basicBossAttackPower = 60;
	
	/**
	 * Declare & Initialize Player Variables
	 */
	
	static int userHP = 100;
	static int maxUserHP = 100;
	static int attackDamage = 30;
	static int numHPPotions = 5;
	static int healthPotionHealAmount = 35;
	static int healthPotionDropChance = 65;
	
	/**
	 * Declare & Initialize EXP System Variables
	 */
	
	/**
	 * static int currentXP = 0;
	 * static int nextLevelUp = 100;
	 * static int maxAmountXPDropped = 25;
	 * static int points = 0;
	 * static int minLevel = 2;
	 * static int maxLevel = 200;
	 */
	
	public static void main(String[] args) {
		
	}
}