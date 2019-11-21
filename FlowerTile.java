import java.util.HashMap;
import java.util.Objects;
import java.awt.Graphics;
import java.awt.event.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class FlowerTile extends PictureTile
{
    public FlowerTile(String incomingName) {
        super(incomingName);

        setToolTipText(this.toString());
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }

    public static void main(String[] args) {
        JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Flower Tiles");
        
		frame.add(new FlowerTile("Chrysanthemum"));
		frame.add(new FlowerTile("Orchid"));
		frame.add(new FlowerTile("Plum"));
		frame.add(new FlowerTile("Bamboo"));
		frame.pack();
		frame.setVisible(true);
    }
}