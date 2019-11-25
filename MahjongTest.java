import java.awt.*;
import javax.swing.*;

public class MahjongTest extends JFrame
{
    public MahjongTest() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new TestPanel());

        setSize(1700, 1000);

        
        setVisible(true);

    }

    public class TestPanel extends JPanel
    {
        public TestPanel()
        {
            setLayout(null); //Implies that Tile must setSize, instead of setpreferredsize

            MahjongModel myGame = new MahjongModel();

            for (Tile tile : myGame.gameDeck) {
                tile.setLocation(tile.xPosition, tile.yPosition);
                add(tile);
            }

            setBackground(Color.BLUE);
        }

    }

    public static void main(String[] args) {
        new MahjongTest();
    }
}