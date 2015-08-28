import java.awt.Canvas;
import java.awt.Dimension;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

import choices.Choices;
import graphics.Screen;
import input.Keyboard;

public class VOTGG extends Canvas implements Runnable{
	
	/**
	 * Declare & Initialize System Variables
	 */
	public static int width = 300;
	public static int height = width / 16 * 9;
	public static int scale = 3;
	public static Scanner in = new Scanner(System.in);
	public static Random rand = new Random();
	public static String title = "Vault of the Ghost Guardian";
	public static String gameExit = "Exit";
	
	private Thread thread;
	private JFrame frame;
	private Keyboard key;
	private boolean running = true;
	
	private Screen screen;
	private Choices choice;
	
	public VOTGG() {
		
		Dimension size = new Dimension(width * scale, height * scale);
		setPreferredSize(size);
		
		screen = new Screen(width, height);
		frame = new JFrame();
		key = new Keyboard();
		choice = new Choices();
		
		addKeyListener(key);
	}
	
	public synchronized void start() {
		running = true;
		thread = new Thread(this, "Display");
		thread.start();
	}
	
	public synchronized void stop() {
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		long lastTime = System.nanoTime();
		long timer = System.currentTimeMillis();
		final double ns = 100000000.0 / 60.0;
		double delta = 0;
		int frames = 0;
		int ticks = 0;
		
		requestFocus();
		while(running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1) {
				tick();
				ticks++;
				delta--;
			}
			//render();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println(ticks + " ups, " + frames + " fps");
				frame.setTitle(title + "  |  " + ticks + " ups, " + frames + " fps");
				ticks = 0;
				frames = 0;
			}
		}
		stop();
	}

	//int x = 0, y = 0;
	
	public void tick() {
		//key.update();
		//if (key.up) y++;
		//if (key.down) y--;
		//if (key.left) x++;
		//if (key.right) x--;
	}
		
	/**
	 * Declare & Initialize Game Variables
	 * TODO: Come up with enemies and boss name ideas
	 */
	static String[] enemies = {"Zombie", "Skeleton", "Witch",
			"Ghost", "Undead Warrior", "Assassin"};
	static String[] bosses = {};
	static String finalBossStage1 = "Ghost Guardian";
	static String finalBossStage2 = "Undead Guardian";
	static String finalBossStage3 = "Resurrected Guardian";
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
		VOTGG game = new VOTGG();
		game.frame.setResizable(false);
		game.frame.setTitle(VOTGG.title);
		game.frame.add(game);
		game.frame.pack();
		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.frame.setLocationRelativeTo(null);
		game.frame.setVisible(true);
		
		game.start();
	}
}