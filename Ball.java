import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	
	int x=100;
	int y=100;
	int size=50;
	int xspeed = 100;
	int yspeed = 100;
	
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.fillOval(x, y, size, size);
	}
	
	public void update() {
		
		x+=xspeed;
		y+=yspeed;
		if((x+size)> MyPanel.BW-size || x<0) {
			xspeed =-xspeed-10;
		}
		
		if((y+size)> MyPanel.BH-size || y<0) {
			yspeed = -yspeed;
		}
	}

}
