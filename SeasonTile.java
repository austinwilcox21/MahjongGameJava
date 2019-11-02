import java.util.HashMap;
import java.util.Objects;
import java.awt.Graphics;
import java.awt.event.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SeasonTile extends PictureTile
{
    public SeasonTile(String incomingName) {
        super(incomingName);

        setToolTipText(this.toString());
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Season Tiles");

        frame.add(new SeasonTile("Spring"));
        frame.add(new SeasonTile("Fall"));
        frame.add(new SeasonTile("Winter"));
        frame.add(new SeasonTile("Summer"));

        frame.pack();
        frame.setVisible(true);
    }
}