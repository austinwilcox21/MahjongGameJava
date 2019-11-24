import java.awt.*;
import javax.swing.*;

public class MahjongTest extends JFrame
{
    public MahjongTest() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new TestPanel());

        setSize(1800, 1000);
        setVisible(true);

    }

    public class TestPanel extends JPanel
    {
        public TestPanel()
        {
            setLayout(null); //Implies that Tile must setSize, instead of setpreferredsize

            //Layers will need to go as follows
            //Highest - Lowest
            //Tower - Base
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

            
            //This will create a 4 column stack of tiles
            // Tile t;
            // t = new SeasonTile("Spring");
            // t.setLocation(200, 100);
            // add(t);

            // t = new SeasonTile("Summer");
            // t.setLocation(180, 120);
            // add(t);

            // t = new SeasonTile("Fall");
            // t.setLocation(160, 140);
            // add(t);

            // t = new SeasonTile("Winter");
            // t.setLocation(140, 160);
            // add(t);
        }

        public void addWeirdTiles()
        {
            Tile t;

            t = new CharacterTile('1');
            t.setLocation(0, 450);
            add(t);
        }

        public void addWeirdTiles2()
        {
            Tile t;

            t = new CharacterTile('2');
            t.setLocation(1300, 450);
            add(t);
            t = new CharacterTile('2');
            t.setLocation(1400, 450);
            add(t);
        }

        public void addRow1(){
            //12 wide
            Tile t;

            t = new CharacterTile('1');
            t.setLocation(100, 100);
            add(t);

            t = new CharacterTile('2');
            t.setLocation(200, 100);
            add(t);

            t = new CharacterTile('3');
            t.setLocation(300, 100);
            add(t);

            t = new CharacterTile('4');
            t.setLocation(400, 100);
            add(t);

            t = new CharacterTile('5');
            t.setLocation(500, 100);
            add(t);

            t = new CharacterTile('6');
            t.setLocation(600, 100);
            add(t);

            t = new CharacterTile('7');
            t.setLocation(700, 100);
            add(t);

            t = new CharacterTile('8');
            t.setLocation(800, 100);
            add(t);

            t = new CharacterTile('9');
            t.setLocation(900, 100);
            add(t);

            t = new CharacterTile('N');
            t.setLocation(1000, 100);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(1100, 100);
            add(t);

            t = new CharacterTile('W');
            t.setLocation(1200, 100);
            add(t);
        }

        public void addRow2(){
            Tile t;
            //8 wide
            t = new CharacterTile('S');
            t.setLocation(300, 200);
            add(t);

            t = new CharacterTile('C');
            t.setLocation(400, 200);
            add(t);

            t = new CharacterTile('F');
            t.setLocation(500, 200);
            add(t);

            t = new SeasonTile("Spring");
            t.setLocation(600, 200);
            add(t);

            t = new SeasonTile("Winter");
            t.setLocation(700, 200);
            add(t);

            t = new SeasonTile("Fall");
            t.setLocation(800, 200);
            add(t);

            t = new SeasonTile("Summer");
            t.setLocation(900, 200);
            add(t);

            t = new FlowerTile("Chrysanthemum");
            t.setLocation(1000, 200);
            add(t);

            
        }

        public void addRow3(){

            Tile t;
            //10 wide
            t = new FlowerTile("Orchid");
            t.setLocation(200, 300);
            add(t);

            t = new FlowerTile("Plum");
            t.setLocation(300, 300);
            add(t);

            t = new FlowerTile("Bamboo");
            t.setLocation(400, 300);
            add(t);

            t = new CircleTile(1);
            t.setLocation(500, 300);
            add(t);

            t = new CircleTile(2);
            t.setLocation(600, 300);
            add(t);

            t = new CircleTile(3);
            t.setLocation(700, 300);
            add(t);

            t = new CircleTile(4);
            t.setLocation(800, 300);
            add(t);

            t = new CircleTile(5);
            t.setLocation(900, 300);
            add(t);

            t = new CircleTile(6);
            t.setLocation(1000, 300);
            add(t);

            t = new CircleTile(7);
            t.setLocation(1100, 300);
            add(t);

            /*
frame.add(new CircleTile(1));
		frame.add(new CircleTile(2));
		frame.add(new CircleTile(3));
		frame.add(new CircleTile(4));
		frame.add(new CircleTile(5));
		frame.add(new CircleTile(6));
		frame.add(new CircleTile(7));
		frame.add(new CircleTile(8));
		frame.add(new CircleTile(9));
            */
        }

        public void addRow4(){
            Tile t;

            t = new CharacterTile('1');
            t.setLocation(100, 400);
            add(t);

            t = new CharacterTile('2');
            t.setLocation(200, 400);
            add(t);

            t = new CharacterTile('3');
            t.setLocation(300, 400);
            add(t);

            t = new CharacterTile('4');
            t.setLocation(400, 400);
            add(t);

            t = new CharacterTile('5');
            t.setLocation(500, 400);
            add(t);

            t = new CharacterTile('6');
            t.setLocation(600, 400);
            add(t);

            t = new CharacterTile('7');
            t.setLocation(700, 400);
            add(t);

            t = new CharacterTile('8');
            t.setLocation(800, 400);
            add(t);

            t = new CharacterTile('9');
            t.setLocation(900, 400);
            add(t);

            t = new CharacterTile('N');
            t.setLocation(1000, 400);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(1100, 400);
            add(t);

            t = new CharacterTile('W');
            t.setLocation(1200, 400);
            add(t);
        }

        public void addRow5(){
            Tile t;

            t = new CharacterTile('1');
            t.setLocation(100, 500);
            add(t);

            t = new CharacterTile('2');
            t.setLocation(200, 500);
            add(t);

            t = new CharacterTile('3');
            t.setLocation(300, 500);
            add(t);

            t = new CharacterTile('4');
            t.setLocation(400, 500);
            add(t);

            t = new CharacterTile('5');
            t.setLocation(500, 500);
            add(t);

            t = new CharacterTile('6');
            t.setLocation(600, 500);
            add(t);

            t = new CharacterTile('7');
            t.setLocation(700, 500);
            add(t);

            t = new CharacterTile('8');
            t.setLocation(800, 500);
            add(t);

            t = new CharacterTile('9');
            t.setLocation(900, 500);
            add(t);

            t = new CharacterTile('N');
            t.setLocation(1000, 500);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(1100, 500);
            add(t);

            t = new CharacterTile('W');
            t.setLocation(1200, 500);
            add(t);
        }

        public void addRow6(){
            Tile t;
            //10 wide
            t = new FlowerTile("Orchid");
            t.setLocation(200, 600);
            add(t);

            t = new FlowerTile("Plum");
            t.setLocation(300, 600);
            add(t);

            t = new FlowerTile("Bamboo");
            t.setLocation(400, 600);
            add(t);

            t = new CircleTile(1);
            t.setLocation(500, 600);
            add(t);

            t = new CircleTile(2);
            t.setLocation(600, 600);
            add(t);

            t = new CircleTile(3);
            t.setLocation(700, 600);
            add(t);

            t = new CircleTile(4);
            t.setLocation(800, 600);
            add(t);

            t = new CircleTile(5);
            t.setLocation(900, 600);
            add(t);

            t = new CircleTile(6);
            t.setLocation(1000, 600);
            add(t);

            t = new CircleTile(7);
            t.setLocation(1100, 600);
            add(t);
        }

        public void addRow7(){
            Tile t;
            //8 wide
            t = new CharacterTile('S');
            t.setLocation(300, 700);
            add(t);

            t = new CharacterTile('C');
            t.setLocation(400, 700);
            add(t);

            t = new CharacterTile('F');
            t.setLocation(500, 700);
            add(t);

            t = new SeasonTile("Spring");
            t.setLocation(600, 700);
            add(t);

            t = new SeasonTile("Winter");
            t.setLocation(700, 700);
            add(t);

            t = new SeasonTile("Fall");
            t.setLocation(800, 700);
            add(t);

            t = new SeasonTile("Summer");
            t.setLocation(900, 700);
            add(t);

            t = new FlowerTile("Chrysanthemum");
            t.setLocation(1000, 700);
            add(t);
        }

        public void addRow8(){
            Tile t;

            t = new CharacterTile('1');
            t.setLocation(100, 800);
            add(t);

            t = new CharacterTile('2');
            t.setLocation(200, 800);
            add(t);

            t = new CharacterTile('3');
            t.setLocation(300, 800);
            add(t);

            t = new CharacterTile('4');
            t.setLocation(400, 800);
            add(t);

            t = new CharacterTile('5');
            t.setLocation(500, 800);
            add(t);

            t = new CharacterTile('6');
            t.setLocation(600, 800);
            add(t);

            t = new CharacterTile('7');
            t.setLocation(700, 800);
            add(t);

            t = new CharacterTile('8');
            t.setLocation(800, 800);
            add(t);

            t = new CharacterTile('9');
            t.setLocation(900, 800);
            add(t);

            t = new CharacterTile('N');
            t.setLocation(1000, 800);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(1100, 800);
            add(t);

            t = new CharacterTile('W');
            t.setLocation(1200, 800);
            add(t);
        }

        public void testAddSecondLayer()
        {
            Tile t;

            //Row 1
            t = new CharacterTile('C');
            t.setLocation(420, 680);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(520, 680);
            add(t);

            t = new CharacterTile('W');
            t.setLocation(620, 680);
            add(t);

            t = new CharacterTile('1');
            t.setLocation(720, 680);
            add(t);

            t = new CharacterTile('2');
            t.setLocation(820, 680);
            add(t);

            t = new CharacterTile('3');
            t.setLocation(920, 680);
            add(t);

            //Row 2
            t = new CharacterTile('C');
            t.setLocation(420, 580);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(520, 580);
            add(t);

            t = new CharacterTile('W');
            t.setLocation(620, 580);
            add(t);

            t = new CharacterTile('1');
            t.setLocation(720, 580);
            add(t);

            t = new CharacterTile('2');
            t.setLocation(820, 580);
            add(t);

            t = new CharacterTile('3');
            t.setLocation(920, 580);
            add(t);

            //Row 3
            t = new CharacterTile('C');
            t.setLocation(420, 480);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(520, 480);
            add(t);

            t = new CharacterTile('W');
            t.setLocation(620, 480);
            add(t);

            t = new CharacterTile('1');
            t.setLocation(720, 480);
            add(t);

            t = new CharacterTile('2');
            t.setLocation(820, 480);
            add(t);

            t = new CharacterTile('3');
            t.setLocation(920, 480);
            add(t);

            //Row 4
            t = new CharacterTile('C');
            t.setLocation(420, 380);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(520, 380);
            add(t);

            t = new CharacterTile('W');
            t.setLocation(620, 380);
            add(t);

            t = new CharacterTile('1');
            t.setLocation(720, 380);
            add(t);

            t = new CharacterTile('2');
            t.setLocation(820, 380);
            add(t);

            t = new CharacterTile('3');
            t.setLocation(920, 380);
            add(t);

            //Row 5
            t = new CharacterTile('C');
            t.setLocation(420, 280);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(520, 280);
            add(t);

            t = new CharacterTile('W');
            t.setLocation(620, 280);
            add(t);

            t = new CharacterTile('1');
            t.setLocation(720, 280);
            add(t);

            t = new CharacterTile('2');
            t.setLocation(820, 280);
            add(t);

            t = new CharacterTile('3');
            t.setLocation(920, 280);
            add(t);

            //Row 6
            t = new CharacterTile('C');
            t.setLocation(420, 180);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(520, 180);
            add(t);

            t = new CharacterTile('W');
            t.setLocation(620, 180);
            add(t);

            t = new CharacterTile('1');
            t.setLocation(720, 180);
            add(t);

            t = new CharacterTile('2');
            t.setLocation(820, 180);
            add(t);

            t = new CharacterTile('3');
            t.setLocation(920, 180);
            add(t);
        }

        public void testAddThirdLayer()
        {
            Tile t;

            //Row 4
            t = new CharacterTile('E');
            t.setLocation(540, 560);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(640, 560);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(740, 560);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(840, 560);
            add(t);

            //Row 3
            t = new CharacterTile('E');
            t.setLocation(540, 460);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(640, 460);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(740, 460);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(840, 460);
            add(t);


            //Row 2
            t = new CharacterTile('E');
            t.setLocation(540, 360);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(640, 360);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(740, 360);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(840, 360);
            add(t);

            //Row 1
            t = new CharacterTile('E');
            t.setLocation(540, 260);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(640, 260);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(740, 260);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(840, 260);
            add(t);
        }

        public void testAddFourthLayer()
        {
            Tile t;

            //Row 2
            t = new CharacterTile('E');
            t.setLocation(660, 440);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(760, 440);
            add(t);

            //Row 1

            t = new CharacterTile('E');
            t.setLocation(660, 340);
            add(t);

            t = new CharacterTile('E');
            t.setLocation(760, 340);
            add(t);
        }

        public void testAddTopLayer()
        {
            Tile t;

            t = new CharacterTile('E');
            t.setLocation(730, 370);
            add(t);
        }

    }

    public static void main(String[] args) {
        new MahjongTest();
    }
}