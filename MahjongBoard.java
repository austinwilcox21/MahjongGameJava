import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
@SuppressWarnings("serial")
public class MahjongBoard extends JPanel implements MouseInputListener
{
    public MahjongBoard() {
        Random rand = new Random();
        setLayout(null);
    }
}