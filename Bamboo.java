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

public class Bamboo
    {
        public Integer x;
        public Integer y;
        public Color color;

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