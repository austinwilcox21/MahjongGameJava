import java.util.Objects;
import java.awt.Graphics;
import java.awt.event.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


//Add abstract back into here.
public class Tile extends JPanel
{
    private static Dimension SIZE;
    private static Polygon SIDE;
    private static Polygon SIDE2;
    private static Polygon SIDE3;
    private static Polygon SIDE4;
    private static Rectangle FACE;
    private static GradientPaint GRAD1;
    private static GradientPaint GRAD2;
    private static GradientPaint GRAD3;
    private static GradientPaint GRAD4;
    private static GradientPaint GRAD5;

    //USED FOR TESTING
    private static ImageIcon image;

    public Tile()
    {
        setPreferredSize(SIZE);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawPolygon(SIDE);

        

        Graphics2D g2 = (Graphics2D)g;

            g2.setPaint(GRAD1);
            g2.fill(SIDE);
            g2.setPaint(GRAD2);
            g2.fill(FACE);
            g2.setPaint(GRAD3);
            g2.fill(SIDE2);
            g2.setPaint(GRAD4);
            g2.fill(SIDE3);
            g2.setPaint(GRAD5);
            g2.fill(SIDE4);

            g2.setColor(Color.BLACK);
            g2.draw(SIDE);

            g2.setColor(Color.BLACK);
            g2.draw(FACE);

            

            g2.setColor(Color.BLACK);
            g2.draw(SIDE2);

            g2.setColor(Color.BLACK);
            g2.draw(SIDE3);

            g2.setColor(Color.BLACK);
            g2.draw(SIDE4);
    }

    static
    {
        image = new ImageIcon("images/Bamboo.png");

        SIZE = new Dimension(121, 121);


        //Positions by index
        int[] x = {10, 20, 20, 10};
        int[] y = {10, 0, 100, 110};
        SIDE = new Polygon(x, y, 4);

        int[] x2 = {10, 110, 120, 20};
        int[] y2 = {110, 110, 100, 100};
        SIDE2 = new Polygon(x2, y2, 4);

        int[] x3 = {10, 10, 0, 0};
        int[] y3 = {10, 110, 120, 20};
        SIDE3 = new Polygon(x3, y3, 4);

        int[] x4 = {0, 100, 110, 10};
        int[] y4 = {120, 120, 110, 110};
        SIDE4 = new Polygon(x4, y4, 4);

        FACE = new Rectangle(20, 0, 100, 100);

        GRAD1 = new GradientPaint(20, 100, Color.WHITE, 120, 0, Color.WHITE);
        GRAD2 = new GradientPaint(10, 110, Color.WHITE, 20, 0, Color.WHITE);
        GRAD3 = new GradientPaint(10, 120, Color.WHITE, 110, 100, Color.RED);
        GRAD4 = new GradientPaint(0, 120, Color.GREEN, 0, 10, Color.WHITE);
        GRAD5 = new GradientPaint(0, 120, Color.GREEN, 110, 100, Color.WHITE);
    }

    
    public boolean matches(Tile tileToCheck)
    {
        if(getClass().toString().equals(tileToCheck.getClass().toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tile Demo");

        frame.add(new Tile());

        frame.pack();
        frame.setVisible(true);
    }

    
}