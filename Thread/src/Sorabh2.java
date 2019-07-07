import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Sorabh2 {
	
	public static void main(String[] args) {
		DisplayMode displayMode = new DisplayMode(800, 600, 16, DisplayMode.BIT_DEPTH_MULTI);
		Sorabh2 s = new Sorabh2();
		s.run(displayMode);
	}
	
	private Screen screen;
	private Image bg;
	private Animation a;
	
	public void loadPics() {
		bg = new ImageIcon("c:\\test\\back.jpg").getImage();
		Image face1 = new ImageIcon("c:\\test\\face1.png").getImage();
		Image face2 = new ImageIcon("c:\\test\\face2.png").getImage();
		a = new Animation();
		a.addScene(face1, 250);
		a.addScene(face2, 250);
	}
	
	public void run(DisplayMode dm) {
		screen = new Screen();
		try {
			screen.setFullScreen(dm, new JFrame());
			loadPics();
			movieLoop();
		} finally {
			screen.restoreScreen();
		}
	}
	
	public void movieLoop() {
		long startingTime = System.currentTimeMillis();
		long cumTime = startingTime;
		
		while(cumTime - startingTime < 5000) {
			long timePassed = System.currentTimeMillis() - cumTime;
			cumTime += timePassed;
			a.update(timePassed);
			
			Graphics g = screen.getFullScreenWindow().getGraphics();
			draw(g);
			g.dispose();
			
			try {
				Thread.sleep(20);
			} catch(Exception e) {}
		}
	}
	
	public void draw(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		g.drawImage(a.getImage(), 0, 0, null);
	}
}
