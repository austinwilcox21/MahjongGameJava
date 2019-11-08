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
    protected ArrayList<Bamboo> bambooTiles;

    public BambooTile(int rank) {
        super(rank);

        setToolTipText(this.toString());

        bambooTiles = new ArrayList<Bamboo>(rank);
        switch(this.rank)
        {
            case 2: 
                bambooTiles.add(new Bamboo(60, 58, super.DarkGreen));
                bambooTiles.add(new Bamboo(60, 16, Color.BLUE));
                break;
            case 3:  
                bambooTiles.add(new Bamboo(60, 16, Color.BLUE));
                bambooTiles.add(new Bamboo(40, 58, super.DarkGreen));
                bambooTiles.add(new Bamboo(80, 58, super.DarkGreen));
                break;
            case 4:  
                bambooTiles.add(new Bamboo(40, 58, super.DarkGreen));
                bambooTiles.add(new Bamboo(40, 16, Color.BLUE));
                bambooTiles.add(new Bamboo(80, 58, Color.BLUE));
                bambooTiles.add(new Bamboo(80, 16, super.DarkGreen));
                break;
            case 5:  
                bambooTiles.add(new Bamboo(35, 58, Color.BLUE));
                bambooTiles.add(new Bamboo(85, 58, super.DarkGreen));
                bambooTiles.add(new Bamboo(60, 34, Color.RED));
                bambooTiles.add(new Bamboo(35, 16, super.DarkGreen));
                bambooTiles.add(new Bamboo(85, 16, Color.BLUE));
                break;
            case 6:  
                bambooTiles.add(new Bamboo(35, 58, Color.BLUE));
                bambooTiles.add(new Bamboo(60, 58, Color.BLUE));
                bambooTiles.add(new Bamboo(85, 58, Color.BLUE));
                bambooTiles.add(new Bamboo(35, 16, super.DarkGreen));
                bambooTiles.add(new Bamboo(60, 16, super.DarkGreen));
                bambooTiles.add(new Bamboo(85, 16, super.DarkGreen));
                break;
            case 7:  
                bambooTiles.add(new Bamboo(35, 65, super.DarkGreen));
                bambooTiles.add(new Bamboo(60, 65, Color.BLUE));
                bambooTiles.add(new Bamboo(85, 65, super.DarkGreen));
                bambooTiles.add(new Bamboo(35, 34, super.DarkGreen));
                bambooTiles.add(new Bamboo(60, 34, Color.BLUE));
                bambooTiles.add(new Bamboo(85, 34, super.DarkGreen));
                bambooTiles.add(new Bamboo(60, 3, Color.RED));
                break;
            case 8:  
                bambooTiles.add(new Bamboo(35, 65, Color.BLUE));
                bambooTiles.add(new Bamboo(60, 65, Color.BLUE));
                bambooTiles.add(new Bamboo(85, 65, Color.BLUE));
                bambooTiles.add(new Bamboo(50, 34, Color.RED));
                bambooTiles.add(new Bamboo(70, 34, Color.RED));
                bambooTiles.add(new Bamboo(35, 3, super.DarkGreen));
                bambooTiles.add(new Bamboo(60, 3, super.DarkGreen));
                bambooTiles.add(new Bamboo(85, 3, super.DarkGreen));
                break;
            case 9:  
                bambooTiles.add(new Bamboo(35, 65, Color.RED));
                bambooTiles.add(new Bamboo(35, 34, Color.RED));
                bambooTiles.add(new Bamboo(60, 65, Color.BLUE));
                bambooTiles.add(new Bamboo(60, 34, Color.BLUE));
                bambooTiles.add(new Bamboo(85, 65, super.DarkGreen));
                bambooTiles.add(new Bamboo(85, 34, super.DarkGreen));
                bambooTiles.add(new Bamboo(35, 3, Color.RED));
                bambooTiles.add(new Bamboo(60, 3, Color.BLUE));
                bambooTiles.add(new Bamboo(85, 3, super.DarkGreen));
                break;
            default: 
                System.err.println("ERROR");
                break;
        }
    }

    public String toString()
    {
        return "Bamboo " + this.rank;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for(Bamboo b : bambooTiles)
        {
            if(b != null)
            {
                b.draw(g);
            }
        }
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
            g.setColor(this.color);
            g.drawRoundRect(this.x, this.y, 15, 25, 5, 5);
            g.fill3DRect(this.x - 3, this.y, 21, 5, true);
            g.fill3DRect(this.x - 3, this.y + 25, 21, 5, true);
            g.fill3DRect(this.x - 3, this.y + 13, 21, 5, true);
        }
    }

    public class RotatedBamboo extends Bamboo
    {
        public RotatedBamboo(Integer x, Integer y, Color c) {
            super(x, y, c);
        }

        public void draw(Graphics g)
        {
            super.draw(g);


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