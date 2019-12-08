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

    public MahjongBoard(long magicNumber)
    {
        myModel = new MahjongModel(magicNumber);

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
        
        if(isClickable(t))
        {
            t.setBorder(BorderFactory.createMatteBorder(6, 6, 6, 6, Color.RED));
            t.IsClicked = true;

            //Loop through all the tiles that are visible, and figure out if any are clicked, if one is, I need to grab it.
            Tile firstTile = new Tile();
            Tile secondTile = new Tile();

            boolean found = false;
            for (Tile t2 : myModel.gameDeck)
            {
                if(t2.isVisible && t2.IsClicked)
                {
                    if(!found)
                    {
                        firstTile = t2;
                        found = true;
                    }
                    else{
                        secondTile = t2;
                        if(firstTile.matches(secondTile) && !firstTile.equals(secondTile))
                        {
                            System.out.println("Reached the equals method");
                            firstTile.removeMouseListener(this);
                            firstTile.isVisible = false;
                            firstTile.setVisible(false);

                            remove(firstTile);
                            secondTile.removeMouseListener(this);
                            secondTile.isVisible = false;
                            secondTile.setVisible(false);

                            remove(secondTile);

                            revalidate();
                        }

                        firstTile.IsClicked = false;
                        secondTile.IsClicked = false;
                        firstTile.setBorder(BorderFactory.createEmptyBorder());
                        secondTile.setBorder(BorderFactory.createEmptyBorder());
                    }
                }
            }
        }
        // t.setBackground(Color.BLUE);

        // t.removeMouseListener(this);
        // t.isVisible = false;
        // t.setVisible(false);

        // remove(t);
        // revalidate();
    }

    public boolean isClickable(Tile t)
    {
        boolean isRightSide = isTileOnRightSide(t);
        boolean isLeftSide = isTileOnLeftSide(t);
        boolean isTileOnTop = isTileOnTop(t);

        if(t.zPosition == 4)
        {
            return true;
        }

        System.out.println("Right Side: " + isRightSide);
        System.out.println("Left Side: " + isLeftSide);
        System.out.println("Top: " + isTileOnTop);

        System.out.println("Tile: (" + t.xPosition + ", " + t.yPosition + ")");

        if((!isRightSide || !isLeftSide) && !isTileOnTop)
            return true;
        else
            return false;
    }

    public boolean isTileOnRightSide(Tile t)
    {
        for(Tile tileToCheck : myModel.gameDeck)
        {
            if(tileToCheck.isVisible && tileToCheck.zPosition == t.zPosition)
            {
                if(t.xPosition == 1200)
                    {
                        if(t.yPosition == 400 || t.yPosition == 500)
                        {
                            if(tileToCheck.xPosition == 1300 && tileToCheck.yPosition == 450)
                            {
                                return true;
                            }
                        }
                    }

                if(t.xPosition + 100 == tileToCheck.xPosition && t.yPosition == tileToCheck.yPosition)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isTileOnLeftSide(Tile t)
    {
        for(Tile tileToCheck : myModel.gameDeck)
        {
            if(tileToCheck.isVisible && tileToCheck.zPosition == t.zPosition)
            {
                if(t.xPosition == 100)
                {
                    if(t.yPosition == 400 || t.yPosition == 500)
                    {
                        if(tileToCheck.xPosition == 0 && tileToCheck.yPosition == 450)
                        {
                            return true;
                        }
                    }
                }
                else if(t.xPosition == 1300 && t.yPosition == 450)
                {
                    if(tileToCheck.xPosition == 1200)
                    {
                        if(tileToCheck.yPosition == 400 || tileToCheck.yPosition == 500)
                        {
                            return true;
                        }
                    }
                }
                
                if(t.xPosition - 100 == tileToCheck.xPosition && t.yPosition == tileToCheck.yPosition)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isTileOnTop(Tile t)
    {
        for(Tile tileToCheck : myModel.gameDeck)
        {
            if(t.zPosition == 3)
            {
                if(tileToCheck.zPosition == 4 && tileToCheck.isVisible)
                {
                    return true;
                }
            }
        }
        
        return false;
    }

    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}