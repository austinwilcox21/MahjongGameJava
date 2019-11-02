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

public class BambooTile extends RankTile
{
    public BambooTile(int rank) {
        super(rank);

        setToolTipText(this.toString());
    }

    public String toString()
    {
        return "Bamboo " + this.rank;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        switch(this.rank)
        {
            case 2:  break;
            case 3:  break;
            case 4:  break;
            case 5:  break;
            case 6:  break;
            case 7:  break;
            case 8:  break;
            case 9:  break;
            default: 
                System.err.println("ERROR");
            break;
        }

        
        g.drawRoundRect(60, 50, 20, 40, 5, 5);
    }

    public class Bamboo
    {
        private Integer x;
        private Integer y;
        private Color color;

        public Bamboo(Integer x, Integer y, Color c)
        {
            this.x = x;
            this.y = y;
            this.color = c;
        }

        public void draw(Graphics g)
        {

        }
    }

    public static void main(String[] args) {
        JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bamboo Tiles");

		frame.add(new BambooTile(2));
		frame.add(new BambooTile(3));
		frame.add(new BambooTile(4));
		frame.add(new BambooTile(5));
		frame.add(new BambooTile(6));
		frame.add(new BambooTile(7));
		frame.add(new BambooTile(8));
		frame.add(new BambooTile(9));

		frame.pack();
		frame.setVisible(true);
    }
}