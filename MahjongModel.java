import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;

public class MahjongModel implements MouseListener
{
    private ArrayList<Tile> tiles = new ArrayList<>(144);
    private TileDeck deck = new TileDeck();
    public static void main(String[] args) {
        
    }

    public void getAllTiles()
    {
        deck.shuffle(10);

        for(int i = 0; i < 144; i++)
        {
            Tile t = deck.deal();
            t.addMouseListener(this);
            tiles.add(t);
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