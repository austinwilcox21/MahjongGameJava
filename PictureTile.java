import java.util.HashMap;
import java.util.Objects;
import java.awt.Graphics;
import java.awt.event.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public abstract class PictureTile extends Tile
{
	private String name;
	private ImageIcon image;

    public PictureTile(String incomingName) {
		this.name = incomingName;
		
		if(this.name == "Sparrow")
		{
			image = new ImageIcon("images/Sparrow.png");
		}
		else
		{
			image = new ImageIcon("images/" + this.toString() + ".png");
		}
        
        image = new ImageIcon(image.getImage().getScaledInstance((int)(image.getIconWidth() * 1.5), -1, Image.SCALE_SMOOTH));
    }

    public String toString()
    {
        //Options that should be displayed
        //"Chrysanthemum", "Orchid", "Plum", "Bamboo", "Spring", "Summer", "Fall", or "Winter"
        return name;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
        image.paintIcon(this, g, (getWidth() / 2 - 38), getHeight() - 120);
	}

    public static void main(String[] args) {
        JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Picture Tiles");

		frame.add(new Bamboo1Tile());

		frame.add(new FlowerTile("Chrysanthemum"));
		frame.add(new FlowerTile("Orchid"));
		frame.add(new FlowerTile("Plum"));
		frame.add(new FlowerTile("Bamboo"));

		frame.add(new SeasonTile("Spring"));
		frame.add(new SeasonTile("Summer"));
		frame.add(new SeasonTile("Fall"));
		frame.add(new SeasonTile("Winter"));

		frame.pack();
		frame.setVisible(true);
    }
}