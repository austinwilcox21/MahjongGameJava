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

public class Circle
    {
        public Integer x;
        public Integer y;
        public Color color;

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