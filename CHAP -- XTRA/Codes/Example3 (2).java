//Java code for the modified Hello World applet:

import java.awt.*;
import java.applet.*;
public class Example3 extends java.applet.Applet
{
static final String message="Hello LMiit";
private Font font;
public void init()
{
font=new Font("Helvetica",Font.BOLD,48);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.pink);
        g.fillOval(10,10,330,100);
        g.setColor(Color.red);
        g.drawOval(10,10,330,100);
        g.drawOval(9,9,332,102);
        g.drawOval(8,8,334,104);
        g.drawOval(7,7,336,106);
        g.setColor(Color.black);
        g.setFont(font);
        g.drawString(message,40,75);
    }
}