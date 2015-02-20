import java.util.Random;
import java.util.Scanner;

public class Game {
	//System.out.println("");
	//System.out.println("------------------------------------------------------");
	
	/**
	 * Declare & Initialize System Variables
	 */
	static Scanner in = new Scanner(System.in);
	static Random rand = new Random();
	static String gameExit = "Exit";
	
	static boolean gameRunning = true;
	
	/**
	 * Declare & Initialize Game Variables
	 */
	static String[] enemies = {};
	static String[] bosses = {};
	static int maxEnemyHP = 60;
	static int enemyAttackPower = 20;
	
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
	 * Experience Points (Level Up System)
	 */
	//static int currentXP = 0;
	//static int nextLevelUp = 100;
	//static int xpMaxDrop = 20;
	//static int points = 0;
	//static int output = 0;
	//static int minlevel = 2;
	//static int maxlevel = 200;
	
	
	public static void main(String[] args) {

	}

}
