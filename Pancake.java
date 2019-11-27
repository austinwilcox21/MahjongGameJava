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