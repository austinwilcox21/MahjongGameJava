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
                circles.add(new Pancake(60, 20, Color.GREEN)); //2nd From Top
                circles.add(new Pancake(60, 60, Color.RED)); //2nd from Bottom
                break;
            case 3: 
                circles.add(new Pancake(60, 40, Color.RED)); //Center
                circles.add(new Pancake(40, 10, Color.BLUE)); //Top pad 10
                circles.add(new Pancake(80, 70, Color.GREEN)); //Bottom pad 10
                break;
            case 4: 
                circles.add(new Pancake(40, 20, Color.BLUE)); //2nd From Top
                circles.add(new Pancake(40, 60, Color.GREEN)); //2nd from Bottom
                circles.add(new Pancake(80, 20, Color.GREEN)); //2nd From Top
                circles.add(new Pancake(80, 60, Color.BLUE)); //2nd from Bottom
                break;
            case 5: 
                circles.add(new Pancake(30, 10, Color.BLUE)); //2nd From Top
                circles.add(new Pancake(30, 70, Color.GREEN)); //2nd from Bottom
                circles.add(new Pancake(90, 10, Color.GREEN)); //2nd From Top
                circles.add(new Pancake(90, 70, Color.BLUE)); //2nd from Bottom
                circles.add(new Pancake(60, 40, Color.RED)); //Center
                break;
            case 6: 
                circles.add(new Pancake(40, 10, Color.GREEN)); //2nd From Top
                circles.add(new Pancake(80, 10, Color.GREEN)); //2nd from Bottom
                circles.add(new Pancake(40, 40, Color.RED)); //2nd From Top
                circles.add(new Pancake(80, 40, Color.RED)); //2nd from Bottom
                circles.add(new Pancake(40, 70, Color.RED)); //2nd From Top
                circles.add(new Pancake(80, 70, Color.RED)); //2nd from Bottom
                break;
            case 7: 
                circles.add(new Pancake(30, 5,  Color.GREEN)); //Center
                circles.add(new Pancake(60, 15, Color.GREEN)); //Top pad 10
                circles.add(new Pancake(90, 25, Color.GREEN)); //Bottom pad 10
                
                circles.add(new Pancake(40, 49, Color.RED)); //2nd From Top
                circles.add(new Pancake(80, 49, Color.RED)); //2nd from Bottom
                circles.add(new Pancake(40, 71, Color.RED)); //2nd From Top
                circles.add(new Pancake(80, 71, Color.RED)); //2nd from Bottom
                break;
            case 8: 
                circles.add(new Pancake(40, 5,  Color.BLUE)); //2nd From Top
                circles.add(new Pancake(40, 27, Color.BLUE)); //2nd from Bottom
                circles.add(new Pancake(40, 49, Color.BLUE)); //2nd From Top
                circles.add(new Pancake(40, 71, Color.BLUE)); //2nd from Bottomcircles.add(new Circle(40, 20, Color.GREEN)); //2nd From Top
                circles.add(new Pancake(80, 5,  Color.BLUE)); //2nd from Bottom
                circles.add(new Pancake(80, 27, Color.BLUE)); //2nd From Top
                circles.add(new Pancake(80, 49, Color.BLUE)); //2nd from Bottom
                circles.add(new Pancake(80, 71, Color.BLUE)); //2nd from Bottom
                break;
            case 9: 
                circles.add(new Pancake(30, 10, Color.GREEN)); //2nd From Top
                circles.add(new Pancake(60, 10, Color.GREEN)); //2nd from Bottom
                circles.add(new Pancake(90, 10, Color.GREEN)); //2nd From Top
                circles.add(new Pancake(30, 40, Color.RED)); //2nd from Bottom
                circles.add(new Pancake(60, 40, Color.RED)); //2nd From Top
                circles.add(new Pancake(90, 40, Color.RED)); //2nd from Bottom
                circles.add(new Pancake(30, 70, Color.BLUE)); //2nd From Top
                circles.add(new Pancake(60, 70, Color.BLUE)); //2nd from Bottom
                circles.add(new Pancake(90, 70, Color.BLUE)); //2nd From Top
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
        }
    }

    public class Pancake extends Circle
    {

        public Pancake(Integer x, Integer y, Color c) {
            super(x, y, c);
        }

        public void draw(Graphics g)
        {
            super.draw(g);

            g.setColor(Color.WHITE);
            g.drawLine(super.x + 3, super.y + 3, super.x + 17, super.y + 17);
            g.drawLine(super.x + 20, super.y, super.x, super.y + 20);
        }
        
    }

    // public class Pancake extends Circle
    // {
    //     public Pancake(Integer x, Integer y, Color c) {
    //         super(x, y, c);
    //     }

    //     public void paintComponent(Graphics g)
    //     {
    //         super.draw(g);

    //         Font f = g.getFont();

    //         f = f.deriveFont(f.getSize2D() * 3.0F);
    //         g.setFont(f);

    //         FontMetrics fm = g.getFontMetrics();
    //         int wid = fm.stringWidth(Character.toString('x'));
            
    //         g.setColor(Color.BLACK);
    //         g.drawString(Character.toString('x'), 25, 25);
                
    //     }
    // }

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