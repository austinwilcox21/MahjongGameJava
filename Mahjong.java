import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Mahjong extends JFrame
{
    public Mahjong() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1700, 1000);

        add(new MahjongBoard());

        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Mahjong();
    }

}