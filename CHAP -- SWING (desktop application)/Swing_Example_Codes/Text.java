import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Text extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g); 

        Graphics2D g2d = (Graphics2D) g;


        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING, 
            RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        Font font = new Font("URW Chancery L", Font.BOLD, 21);
        g2d.setFont(font);

        g2d.drawString("Not marble, nor the gilded monuments", 20, 30);
        g2d.drawString("Of princes, shall outlive this powerful rhyme;"
            ,20, 60);
        g2d.drawString("But you shall shine more bright in these contents",
            20, 90);
        g2d.drawString("Than unswept stone, besmear'd with sluttish time.", 
            20, 120);
        g2d.drawString("When wasteful war shall statues overturn,", 20, 150);
        g2d.drawString("And broils root out the work of masonry,", 20, 180);
        g2d.drawString("Nor Mars his sword, nor war's quick " +
            "fire shall burn", 20, 210);
        g2d.drawString("The living record of your memory.", 20, 240);
        g2d.drawString("'Gainst death, and all oblivious enmity", 20, 270);
        g2d.drawString("Shall you pace forth; your praise shall still " +
            "find room", 20, 300);
        g2d.drawString("Even in the eyes of all posterity", 20, 330);
        g2d.drawString("That wear this world out to the ending doom.", 20, 360);
        g2d.drawString("So, till the judgment that yourself arise,", 20, 390);
        g2d.drawString("You live in this, and dwell in lovers' eyes.", 20, 420);

    }

    public static void main(String[] args) {

        Text text = new Text();
        JFrame frame = new JFrame("Sonnet 55");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(text);
        frame.setSize(500, 470);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
