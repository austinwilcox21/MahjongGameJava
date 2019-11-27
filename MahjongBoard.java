import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MahjongBoard extends JPanel  implements MouseListener
{
    public MahjongModel myModel;

    public MahjongBoard() {
        myModel = new MahjongModel();

        setLayout(null);
        paintBoard();
        
    }

    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        URL url = MahjongBoard.class.getResource("images/dragon_bg.png");
		ImageIcon image = new ImageIcon(url);
        
        image = new ImageIcon(image.getImage().getScaledInstance(1700, 1000, Image.SCALE_SMOOTH));
        g.drawImage(image.getImage(), 0, 0, null);
    }

    public void paintBoard()
    {
        for (Tile tile : myModel.gameDeck) {
            if(tile.isVisible)
            {
                tile.setLocation(tile.xPosition, tile.yPosition);
                tile.addMouseListener(this);
                add(tile);
            }
        }
    }

    public void mousePressed(MouseEvent e)
    {
        Tile t = (Tile)e.getSource();
        System.out.println(t.isVisible);
        System.out.println(t.toString());

        System.out.println(t.getParent().getComponentZOrder(t));

        t.setBackground(Color.BLUE);

        t.removeMouseListener(this);
        t.isVisible = false;
        t.setVisible(false);

        remove(t);
        revalidate();
    }

    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}