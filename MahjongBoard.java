import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
@SuppressWarnings("serial")
public class MahjongBoard extends JPanel // implements MouseInputListener
{
    public MahjongModel myModel;

    public MahjongBoard() {

        setLayout(null);
        myModel = new MahjongModel();
        for (Tile tile : myModel.gameDeck) {
            if(tile.isVisible)
            {
                tile.setLocation(tile.xPosition, tile.yPosition);
                add(tile);
            }
        }
    }

    // public void mousePressed(mouseEvent e)
    // {
    //     Tile t = (Tile)e.getSource();

    //     if(e.getButton() == mouseEvent.BUTTON3)
    //     {
    //         System.out.println("Reached");
    //     }
    // }

    // public void mouseReleased(mouseEvent e){}
    // public void mouseClicked(mouseEvent e){}
    // public void mouseEntered(mouseEvent e){}
    // public void mouseExited(mouseEvent e){}
}