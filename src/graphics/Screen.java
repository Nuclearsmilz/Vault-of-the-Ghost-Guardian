package graphics;

import java.util.Random;

public class Screen {
	
	private int width, height;
	public int[] pixels;
	
	private Random rand = new Random();
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}
	
	public void clear() {
		for(int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}
}