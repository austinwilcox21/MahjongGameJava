import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.awt.Graphics;
import java.awt.event.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class WhiteDragonTile extends Tile
{
	public WhiteDragonTile() {
		setToolTipText(this.toString());
	}

	public String toString()
	{
		return "White Dragon";
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.setColor(Color.BLUE);

		//Left Wall
		g.drawRect(25, 15, 9, 10);
		g.fill3DRect(25, 25, 10, 10, true);
		g.drawRect(25, 35, 9, 10);
		g.fill3DRect(25, 45, 10, 10, true);
		g.drawRect(25, 55, 9, 10);
		g.fill3DRect(25, 65, 10, 10, true);
		g.drawRect(25, 75, 9, 10);
		g.fill3DRect(25, 85, 10, 10, true);

		//Top Wall
		g.fill3DRect(25, 5, 10, 10, true);
		g.drawRect(35, 5, 10, 9);
		g.fill3DRect(45, 5, 10, 10, true);
		g.drawRect(55, 5, 10, 9);
		g.fill3DRect(65, 5, 10, 10, true);
		g.drawRect(75, 5, 10, 9);
		g.fill3DRect(85, 5, 10, 10, true);
		g.drawRect(95, 5, 10, 9);

		//Right Wall
		g.fill3DRect(105, 5, 10, 10, true);
		g.drawRect(105, 15, 9, 10);
		g.fill3DRect(105, 25, 10, 10, true);
		g.drawRect(105, 35, 9, 10);
		g.fill3DRect(105, 45, 10, 10, true);
		g.drawRect(105, 55, 9, 10);
		g.fill3DRect(105, 65, 10, 10, true);
		g.drawRect(105, 75, 9, 10);
		g.fill3DRect(105, 85, 10, 10, true);

		//Bottom Wall
		g.fill3DRect(25, 85, 10, 10, true);
		g.drawRect(35, 85, 10, 9);
		g.fill3DRect(45, 85, 10, 10, true);
		g.drawRect(55, 85, 10, 9);
		g.fill3DRect(65, 85, 10, 10, true);
		g.drawRect(75, 85, 10, 9);
		g.fill3DRect(85, 85, 10, 10, true);
		g.drawRect(95, 85, 10, 9);
	}

	public static void main(String[] args) {
        JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("White Dragon Tile");

		frame.add(new WhiteDragonTile());

		frame.pack();
		frame.setVisible(true);
    }
}



