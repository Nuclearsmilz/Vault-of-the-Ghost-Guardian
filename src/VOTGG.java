import java.awt.Canvas;
import java.awt.Dimension;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

import choices.Choices;
import graphics.Screen;
import input.Keyboard;

public class VOTGG extends Canvas implements Runnable{

	private static final long serialVersionUID = 1L;
	
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
		
		screen = new Screen();
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
				ticks++;
				delta--;
			}
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