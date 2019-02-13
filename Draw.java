import javax.swing.JComponent;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Draw extends JComponent{

	public BufferedImage image;
	public URL resource = getClass().getResource("run0.png");
	private BufferedImage backgroundImage;
	

	// circle's position
	public int x = 30;
	public int y = 30;
	public int mCount;

	Hero hero1;

	Monster monster1;
	Monster monster2;
	Monster monster3;
	Monster monster4;

	public Draw(){
		Monster monster[] = new Monster[4];
		monster1 = new Monster(200, 200);
		monster2 = new Monster(300, 200);
		monster3 = new Monster(400, 200);
		monster4 = new Monster(500, 200);

		try{
			image = ImageIO.read(resource);
			backgroundImage = ImageIO.read(getClass().getResource("background.jpg"));
		}
		catch(IOException e){
			e.printStackTrace();
		}

		hero1 = new Hero(this);
		try{
			image = ImageIO.read(resource);
			backgroundImage = ImageIO.read(getClass().getResource("background.jpg"));
		}
		catch(IOException e){
			e.printStackTrace();

		}
	}

	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.drawImage(backgroundImage, 0, 0, this);

		g.drawImage(hero1.image, hero1.xPos, hero1.yPos, this);

		g.drawImage(monster1.image, monster1.xPos, monster1.yPos, this);
		g.drawImage(monster2.image, monster2.xPos, monster2.yPos, this);
		g.drawImage(monster3.image, monster3.xPos, monster3.yPos, this);
		g.drawImage(monster4.image, monster4.xPos, monster4.yPos, this);
	}
}