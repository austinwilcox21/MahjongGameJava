import java.util.HashMap;
import java.util.Objects;
import java.awt.Graphics;
import java.awt.event.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class CharacterTile extends Tile
{
    protected char symbol;
    static HashMap<Character, Character> englishToChineseMap = new HashMap<>();


    public CharacterTile(char incomingSymbol) {
        this.symbol = incomingSymbol;
        populateHashMap();

        setToolTipText(this.toString());
    }

    private void populateHashMap(){
        englishToChineseMap.put('1', '\u4E00');
        englishToChineseMap.put('2', '\u4E8C');
        englishToChineseMap.put('3', '\u4E09');
        englishToChineseMap.put('4', '\u56DB');
        englishToChineseMap.put('5', '\u4E94');
        englishToChineseMap.put('6', '\u516D');
        englishToChineseMap.put('7', '\u4E03');
        englishToChineseMap.put('8', '\u516B');
        englishToChineseMap.put('9', '\u4E5D');
        englishToChineseMap.put('N', '\u5317');
        englishToChineseMap.put('E', '\u6771');
        englishToChineseMap.put('W', '\u897F');
        englishToChineseMap.put('S', '\u5357');
        englishToChineseMap.put('C', '\u4E2D');
        englishToChineseMap.put('F', '\u767C');
    }

    public boolean matches(Tile tileToCheck)
    {
        if(super.matches(tileToCheck))
        {
            if(this.toString().equals(tileToCheck.toString()))
            {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public String toString()
    {
        int value;
        try 
        {
            value = Integer.parseInt(String.valueOf(this.symbol));
            
            return "Character " + value;

        } 
        catch (Exception ex) 
        {
            String valueToReturn = "";
            switch(this.symbol)
            {
                case 'N': valueToReturn = "North Wind"; break;
                case 'E': valueToReturn = "East Wind"; break;
                case 'W': valueToReturn = "West Wind"; break;
                case 'S': valueToReturn = "South Wind"; break;
                case 'C': valueToReturn = "Red Dragon"; break;
                case 'F': valueToReturn = "Green Dragon"; break;
                default: valueToReturn = "Error"; break;
            }
            return valueToReturn;
        }
    }

    public String toChinese()
    {
        return Character.toString(englishToChineseMap.get(this.symbol));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        // image = new ImageIcon("images/Bamboo.png");
        // image = new ImageIcon(image.getImage().getScaledInstance((int)(image.getIconWidth() * 1.2), -1, Image.SCALE_SMOOTH));
        // image.paintIcon(this, g, 35, 10);
        g.setColor(Color.RED);
        g.drawString(Character.toString(this.symbol), 105, 14);

        Font f = g.getFont();

        if(this.symbol == 'N' || this.symbol == 'E' || this.symbol == 'W' || this.symbol == 'S' || this.symbol == 'C' || this.symbol == 'F')
        {
            f = f.deriveFont(f.getSize2D() * 6.0F);
            g.setFont(f);

            FontMetrics fm = g.getFontMetrics();
            int wid = fm.stringWidth(Character.toString(englishToChineseMap.get(this.symbol)));

            if(this.symbol == 'C')
            {
                g.setColor(Color.RED);
            }
            else if(this.symbol == 'F')
            {
                g.setColor(super.DarkGreen);
            }
            else
            {
                g.setColor(Color.BLACK);
            }
            g.drawString(Character.toString(englishToChineseMap.get(this.symbol)), (getWidth() - wid + 20) / 2, getHeight() - 40);
        }
        else
        {
            f = f.deriveFont(f.getSize2D() * 3.0F);
            g.setFont(f);

            FontMetrics fm = g.getFontMetrics();
            int wid = fm.stringWidth(Character.toString(englishToChineseMap.get(this.symbol)));

            g.setColor(Color.BLACK);
            g.drawString(Character.toString(englishToChineseMap.get(this.symbol)), (getWidth() - wid + 20) / 2, getHeight() - 80);

            g.setColor(Color.RED);
            g.drawString(Character.toString('\u842C'), (getWidth() - wid + 20) / 2, getHeight() - 30);
            
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Character Tiles");

        frame.add(new CharacterTile('N'));
        frame.add(new CharacterTile('E'));
        frame.add(new CharacterTile('S'));
        frame.add(new CharacterTile('W'));
        frame.add(new CharacterTile('C'));
        frame.add(new CharacterTile('F'));
        frame.add(new CharacterTile('1'));
        frame.add(new CharacterTile('2'));
        frame.add(new CharacterTile('3'));
        frame.add(new CharacterTile('4'));
        frame.add(new CharacterTile('5'));
        frame.add(new CharacterTile('6'));
        frame.add(new CharacterTile('7'));
        frame.add(new CharacterTile('8'));
        frame.add(new CharacterTile('9'));

        frame.pack();
        frame.setVisible(true);
    }
}