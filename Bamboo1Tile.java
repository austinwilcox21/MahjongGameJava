import java.util.HashMap;
import java.util.Objects;
import java.awt.Graphics;
import java.awt.event.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Bamboo1Tile extends PictureTile
{
	public Bamboo1Tile()
	{
		super("Sparrow");
		setToolTipText(this.toString());
	}

	public String toString()
	{
		return "Bamboo 1";
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sparrow Tile");

        frame.add(new Bamboo1Tile());

        frame.pack();
        frame.setVisible(true);
	}
}

