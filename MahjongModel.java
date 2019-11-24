import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.*;

import javax.swing.*;

public class MahjongModel implements MouseListener
{
    private ArrayList<Tile> tiles = new ArrayList<>(144);
    public static void main(String[] args) {
        getAllTiles();
    }

    public static void getAllTiles()
    {
        //0 Means it's 
        for(int z = 4; z <= 0; z--)
        {
            for(int x = 0; x < 8; x++)
            {
                for(int y = 0; y < 15; y++)
                {

                    switch(z)
                    {
                    case 4: break;
                    case 3: break;
                    case 2: break;
                    case 1: break;
                    case 0: break;
                    default: break;   
                    }
                }
                switch(z)
                {
                    case 4: 
                    
                    break;
                    case 3: 
                    
                    break;
                    case 2: break;
                    case 1: break;
                    case 0: break;
                    default: break;   
                }
            }
        }
    }

    public void positionTile(Tile t, int x, int y, int z)
    {

    }

    public boolean isTileOpen(Tile t)
    {

    }

    public Tile getTile(int x, int y, int z)
    {

    }

    public void mousePressed(MouseEvent e)
    {
        Tile t = (Tile)e.getSource();

        if(e.getButton() == MouseEvent.BUTTON3)
        {
            System.out.println("Reached");
        }
    }

    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}