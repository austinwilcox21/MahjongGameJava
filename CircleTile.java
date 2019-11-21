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
@SuppressWarnings("serial")
public class CircleTile extends RankTile
{
    protected ArrayList<Circle> circles;

    public CircleTile(int rank) {
        super(rank);
        setToolTipText(this.toString());
        
        circles = new ArrayList<Circle>(rank);
        switch(rank)
        {
            case 1: 
                circles.add(new Pancake(60, 40, Color.RED)); //Center
                break;
            case 2: 
                circles.add(new Circle(60, 20, Tile.DarkGreen)); //2nd From Top
                circles.add(new Circle(60, 60, Color.RED)); //2nd from Bottom
                break;
            case 3: 
                circles.add(new Circle(60, 40, Color.RED)); //Center
                circles.add(new Circle(40, 10, Color.BLUE)); //Top pad 10
                circles.add(new Circle(80, 70, Tile.DarkGreen)); //Bottom pad 10
                break;
            case 4: 
                circles.add(new Circle(40, 20, Color.BLUE)); //2nd From Top
                circles.add(new Circle(40, 60, Tile.DarkGreen)); //2nd from Bottom
                circles.add(new Circle(80, 20, Tile.DarkGreen)); //2nd From Top
                circles.add(new Circle(80, 60, Color.BLUE)); //2nd from Bottom
                break;
            case 5: 
                circles.add(new Circle(30, 10, Color.BLUE)); //2nd From Top
                circles.add(new Circle(30, 70, Tile.DarkGreen)); //2nd from Bottom
                circles.add(new Circle(90, 10, Tile.DarkGreen)); //2nd From Top
                circles.add(new Circle(90, 70, Color.BLUE)); //2nd from Bottom
                circles.add(new Circle(60, 40, Color.RED)); //Center
                break;
            case 6: 
                circles.add(new Circle(40, 10, Tile.DarkGreen)); //2nd From Top
                circles.add(new Circle(80, 10, Tile.DarkGreen)); //2nd from Bottom
                circles.add(new Circle(40, 40, Color.RED)); //2nd From Top
                circles.add(new Circle(80, 40, Color.RED)); //2nd from Bottom
                circles.add(new Circle(40, 70, Color.RED)); //2nd From Top
                circles.add(new Circle(80, 70, Color.RED)); //2nd from Bottom
                break;
            case 7: 
                circles.add(new Circle(30, 5,  Tile.DarkGreen)); //Center
                circles.add(new Circle(60, 15, Tile.DarkGreen)); //Top pad 10
                circles.add(new Circle(90, 25, Tile.DarkGreen)); //Bottom pad 10
                
                circles.add(new Circle(40, 49, Color.RED)); //2nd From Top
                circles.add(new Circle(80, 49, Color.RED)); //2nd from Bottom
                circles.add(new Circle(40, 71, Color.RED)); //2nd From Top
                circles.add(new Circle(80, 71, Color.RED)); //2nd from Bottom
                break;
            case 8: 
                circles.add(new Circle(40, 5,  Color.BLUE)); //2nd From Top
                circles.add(new Circle(40, 27, Color.BLUE)); //2nd from Bottom
                circles.add(new Circle(40, 49, Color.BLUE)); //2nd From Top
                circles.add(new Circle(40, 71, Color.BLUE)); //2nd from Bottomcircles.add(new Circle(40, 20, super.DarkGreen)); //2nd From Top
                circles.add(new Circle(80, 5,  Color.BLUE)); //2nd from Bottom
                circles.add(new Circle(80, 27, Color.BLUE)); //2nd From Top
                circles.add(new Circle(80, 49, Color.BLUE)); //2nd from Bottom
                circles.add(new Circle(80, 71, Color.BLUE)); //2nd from Bottom
                break;
            case 9: 
                circles.add(new Circle(30, 10, Tile.DarkGreen)); //2nd From Top
                circles.add(new Circle(60, 10, Tile.DarkGreen)); //2nd from Bottom
                circles.add(new Circle(90, 10, Tile.DarkGreen)); //2nd From Top
                circles.add(new Circle(30, 40, Color.RED)); //2nd from Bottom
                circles.add(new Circle(60, 40, Color.RED)); //2nd From Top
                circles.add(new Circle(90, 40, Color.RED)); //2nd from Bottom
                circles.add(new Circle(30, 70, Color.BLUE)); //2nd From Top
                circles.add(new Circle(60, 70, Color.BLUE)); //2nd from Bottom
                circles.add(new Circle(90, 70, Color.BLUE)); //2nd From Top
                break;
            default: 
                System.err.println("ERROR Index Out Of Bounds");
                break;
        }
    }

    public String toString()
    {
        return "Circle " + this.rank;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for(Circle c : circles)
        {
            if(c != null)
            {
                c.draw(g);
            }
        }
    }

    public class Circle
    {
        private Integer x;
        private Integer y;
        private Color color;

        public Circle(Integer x, Integer y, Color c)
        {
            this.x = x;
            this.y = y;
            this.color = c;
        }

        public void draw(Graphics g)
        {
            g.setColor(this.color);
            g.fillOval(this.x, this.y, 20, 20);

            //TODO
            //still drawing the x to far.
            g.setColor(Color.WHITE);
            g.drawLine(this.x + 3, this.y + 3, this.x + 17, this.y + 17);
            //g.drawLine(this.x + 20, this.y, this.x, this.y + 20);
            g.drawLine(this.x + 17, this.y, this.x, this.y + 17);
        }
    }

    public class Pancake extends Circle
    {

        public Pancake(Integer x, Integer y, Color c) {
            super(x, y, c);
        }

        public void draw(Graphics g)
        {
            g.setColor(new Color(0, 179, 39));
            g.fillOval(super.x - 27, super.y - 27, 75, 75);

            g.setColor(Color.WHITE);

            //Top And Bottom
            g.fillOval(super.x + 7, super.y - 25, 5, 5);
            g.fillOval(super.x + 7, super.y + 38, 5, 5);

            //Left and Right
            g.fillOval(super.x + 40, super.y + 5, 5, 5);
            g.fillOval(super.x - 25, super.y + 5, 5, 5);

            g.fillOval(super.x + 30, super.y + 28, 5, 5);
            g.fillOval(super.x - 16, super.y - 15, 5, 5);

            g.fillOval(super.x - 16, super.y + 28, 5, 5);
            g.fillOval(super.x + 30, super.y - 15, 5, 5);

            super.draw(g);

            
        }
        
    }

    public static void main(String[] args) {
        JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Circle Tiles");

		frame.add(new CircleTile(1));
		frame.add(new CircleTile(2));
		frame.add(new CircleTile(3));
		frame.add(new CircleTile(4));
		frame.add(new CircleTile(5));
		frame.add(new CircleTile(6));
		frame.add(new CircleTile(7));
		frame.add(new CircleTile(8));
		frame.add(new CircleTile(9));

		frame.pack();
		frame.setVisible(true);
    }
}