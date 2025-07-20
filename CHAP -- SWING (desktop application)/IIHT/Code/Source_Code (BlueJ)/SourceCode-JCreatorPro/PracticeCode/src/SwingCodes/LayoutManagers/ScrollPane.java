import javax.swing.*;
import java.awt.*;

public class ScrollPane extends JFrame
{
	private JPanel Pnl = new JPanel();
    private JScrollPane Scrl = new JScrollPane(Pnl,
    ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
    ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    private JLabel Lbl = new JLabel("<html>Video provides a powerful way to help you prove your point. <br>When you click Online Video, <br>you can paste in the embed code for the video you want to add. <br>You can also type a keyword to search online for the video that best fits your document.<br>To make your document look professionally produced, <br>Word provides header, footer, cover page, and text box designs that complement each other. <br>For example, you can add a matching cover page, header, and sidebar. <br>Click Insert and then choose the elements you want from the different galleries.<br>Themes and styles also help keep your document coordinated. <br>When you click Design and choose a new Theme, the pictures, charts, and SmartArt graphics change to match your new theme. <br>When you apply styles, your headings change to match the new theme.Save time in Word with new buttons that show up where you need them. To change the way a picture fits in your document, click it and a button for layout options appears next to it. When you work on a table, click where you want to add a row or a column, and then click the plus sign.Reading is easier, too, in the new Reading view. You can collapse parts of the document and focus on the text you want. If you need to stop reading before you reach the end, Word remembers where you left off - even on another device.</html>");
    private Font font = new Font("Arial", Font.PLAIN, 20);
    private Container cntnr;
    public ScrollPane()
    {
    	super("Title Bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cntnr = getContentPane();
        Lbl.setFont(font);
        cntnr.add(Scrl);
        Pnl.add(Lbl);
    }
	
	public static void main(String[] args)
    {
		final int WIDTH = 180;
        final int HEIGHT = 100;
        ScrollPane Scroll = new ScrollPane();
        Scroll.setSize(250,300);
        Scroll.setVisible(true);
    }
}