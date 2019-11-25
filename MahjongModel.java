import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class MahjongModel implements MouseListener
{
    private ArrayList<Tile> tiles = new ArrayList<>(144);
    public ArrayList<Tile> gameDeck = new ArrayList<>(144);

    public MahjongModel() {
        for (int i = 0; i < 4; i++)
		{
			// CharacterTiles
			for (char c = '1'; c <= '9'; c++)
				tiles.add(new CharacterTile(c));

            tiles.add(new CharacterTile('N'));
            tiles.add(new CharacterTile('E'));
            tiles.add(new CharacterTile('W'));
            tiles.add(new CharacterTile('S'));
            tiles.add(new CharacterTile('C'));
            tiles.add(new CharacterTile('F'));

			// CircleTiles
			for (int j = 1; j < 10; j++)
                tiles.add(new CircleTile(j));

			// BambooTiles
			for (int j = 2; j < 10; j++)
                tiles.add(new BambooTile(j));

			// Special Tiles
            tiles.add(new WhiteDragonTile());
			tiles.add(new Bamboo1Tile());
		}

		// FlowerTiles
		tiles.add(new FlowerTile("Chrysanthemum"));
		tiles.add(new FlowerTile("Orchid"));
		tiles.add(new FlowerTile("Plum"));
		tiles.add(new FlowerTile("Bamboo"));

		// SeasonTiles
		tiles.add(new SeasonTile("Spring"));
		tiles.add(new SeasonTile("Summer"));
		tiles.add(new SeasonTile("Fall"));
        tiles.add(new SeasonTile("Winter"));
        
        shuffle();

        testAddTopLayer();
        testAddFourthLayer();
        testAddThirdLayer();
        testAddSecondLayer();
        addWeirdTiles();
        addRow8();
        addRow7();
        addRow6();
        addRow5();
        addRow4();
        addRow3();
        addRow2();
        addRow1();
        addWeirdTiles2();
    }

    public void positionTile(Tile t, int x, int y, int z)
    {
        t.xPosition = x;
        t.yPosition = y;
        t.zPosition = z;
    }

    public boolean isTileOpen(Tile t)
    {
        return true;
    }

    public Tile getTile(int x, int y, int z)
    {
        return new Tile();
    }

    public void shuffle()
	{
		Collections.shuffle(this.tiles);
	}

	public void shuffle(long gameNumber)
	{
		Collections.shuffle(this.tiles, new Random(gameNumber));
	}

	public Tile deal()
	{
		if(this.tiles.size() > 0)
		{
			Tile temp = this.tiles.get(0);
			this.tiles.remove(0);
			return temp;
		}
		else
		{
			return null;
		}
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


    public void addWeirdTiles()
    {
        Tile t;

        t = deal();
        positionTile(t, 0, 450, 0);
        gameDeck.add(t);
    }

    public void addWeirdTiles2()
    {
        Tile t;

        t = deal();
        positionTile(t, 1300, 450, 450);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1400, 450, 0);
        gameDeck.add(t);
    }

    public void addRow1(){
        //12 wide
        Tile t;

        t = deal();
        positionTile(t, 100, 100, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 200, 100, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 300, 100, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 400, 100, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 500, 100, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 600, 100, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 700, 100, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 800, 100, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 900, 100, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1000, 100, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1100, 100, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1200, 100, 0);
        gameDeck.add(t);
    }

    public void addRow2(){
        Tile t;
        //8 wide
        t = deal();
        positionTile(t, 300, 200, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 400, 200, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 500, 200, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 600, 200, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 700, 200, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 800, 200, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 900, 200, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1000, 200, 0);
        gameDeck.add(t);
        
    }

    public void addRow3(){

        Tile t;
        //10 wide
        t = deal();
        positionTile(t, 200, 300, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 300, 300, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 400, 300, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 500, 300, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 600, 300, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 700, 300, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 800, 300, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 900, 300, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1000, 300, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1100, 300, 0);
        gameDeck.add(t);
    }

    public void addRow4(){
        Tile t;

        t = deal();
        positionTile(t, 100, 400, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 200, 400, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 300, 400, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 400, 400, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 500, 400, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 600, 400, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 700, 400, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 800, 400, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 900, 400, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1000, 400, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1100, 400, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1200, 400, 0);
        gameDeck.add(t);
    }

    public void addRow5(){
        Tile t;

        t = deal();
        positionTile(t, 100, 500, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 200, 500, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 300, 500, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 400, 500, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 500, 500, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 600, 500, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 700, 500, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 800, 500, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 900, 500, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1000, 500, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1100, 500, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1200, 500, 0);
        gameDeck.add(t);
    }

    public void addRow6(){
        Tile t;
        //10 wide
        t = deal();
        positionTile(t, 200, 600, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 300, 600, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 400, 600, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 500, 600, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 600, 600, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 700, 600, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 800, 600, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 900, 600, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1000, 600, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1100, 600, 0);
        gameDeck.add(t);
    }

    public void addRow7(){
        Tile t;
        //8 wide
        t = deal();
        positionTile(t, 300, 700, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 400, 700, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 500, 700, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 600, 700, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 700, 700, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 800, 700, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 900, 700, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1000, 700, 0);
        gameDeck.add(t);
    }

    public void addRow8(){
        Tile t;

        t = deal();
        positionTile(t, 100, 800, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 200, 800, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 300, 800, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 400, 800, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 500, 800, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 600, 800, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 700, 800, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 800, 800, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 900, 800, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1000, 800, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1100, 800, 0);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 1200, 800, 0);
        gameDeck.add(t);
    }

    public void testAddSecondLayer()
    {
        Tile t;

        //Row 1
        t = deal();
        positionTile(t, 420, 680, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 520, 680, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 620, 680, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 720, 680, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 820, 680, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 920, 680, 1);
        gameDeck.add(t);

        //Row 2
        t = deal();
        positionTile(t, 420, 580, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 520, 580, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 620, 580, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 720, 580, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 820, 580, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 920, 580, 1);
        gameDeck.add(t);

        //Row 3
        t = deal();
        positionTile(t, 420, 480, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 520, 480, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 620, 480, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 720, 480, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 820, 480, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 920, 480, 1);
        gameDeck.add(t);

        //Row 4
        t = deal();
        positionTile(t, 420, 380, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 520, 380, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 620, 380, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 720, 380, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 820, 380, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 920, 380, 1);
        gameDeck.add(t);

        //Row 5
        t = deal();
        positionTile(t, 420, 280, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 520, 280, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 620, 280, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 720, 280, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 820, 280, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 920, 280, 1);
        gameDeck.add(t);

        //Row 6
        t = deal();
        positionTile(t, 420, 180, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 520, 180, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 620, 180, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 720, 180, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 820, 180, 1);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 920, 180, 1);
        gameDeck.add(t);
    }

    public void testAddThirdLayer()
    {
        Tile t;

        //Row 4
        t = deal();
        positionTile(t, 540, 560, 2);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 640, 560, 2);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 740, 560, 2);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 840, 560, 2);
        gameDeck.add(t);

        //Row 3
        t = deal();
        positionTile(t, 540, 460, 2);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 640, 460, 2);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 740, 460, 2);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 840, 460, 2);
        gameDeck.add(t);

        //Row 2
        t = deal();
        positionTile(t, 540, 360, 2);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 640, 360, 2);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 740, 360, 2);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 840, 360, 2);
        gameDeck.add(t);

        //Row 1
        t = deal();
        positionTile(t, 540, 260, 2);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 640, 260, 2);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 740, 260, 2);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 840, 260, 2);
        gameDeck.add(t);
    }

    public void testAddFourthLayer()
    {
        Tile t;

        //Row 2
        t = deal();
        positionTile(t, 660, 440, 3);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 760, 440, 3);
        gameDeck.add(t);

        //Row 1

        t = deal();
        positionTile(t, 660, 340, 3);
        gameDeck.add(t);

        t = deal();
        positionTile(t, 760, 340, 3);
        gameDeck.add(t);
    }

    public void testAddTopLayer()
    {
        Tile t;

        t = deal();
        positionTile(t, 730, 370, 4);
        gameDeck.add(t);
    }

}