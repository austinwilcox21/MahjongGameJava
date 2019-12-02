import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class Mahjong extends JFrame
{
    private JPanel menuPanel = new JPanel();

    public Mahjong() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1700, 1000);

        
        add(menuPanel);
        makeMenu();
        add(new MahjongBoard());
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Mahjong();
    }

    private void makeMenu()
    {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mainMenu = new JMenu("Main");
        menuBar.add(mainMenu);

         JMenuItem newGame = new JMenuItem("New Game");
         newGame.setToolTipText("Start a new game");
         newGame.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
                new Mahjong();
             }
         });

         mainMenu.add(newGame);
    }

}