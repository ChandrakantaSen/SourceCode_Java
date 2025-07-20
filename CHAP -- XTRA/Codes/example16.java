import java.awt.*;
import java.applet.*;
public class example16 extends java.applet.Applet
{
static final String message="HELLO WORLD";
private Font font;
public void init()
{
font=new Font("Helvetica",font.BOLD,48);
}
public void paint(Graphics g)
{
g.setColor(Color.pink);
g.fillRoundRect(10,10,330,100,50,60);
g.setColor(Color.red);
g.drawRoundRect(10,10,330,100,50,60);
g.drawRoundRect(9,9,332,102,50,60);
g.drawRoundRect(8,8,334,104,50,60);
g.drawRoundRect(7,7,336,106,50,60);
g.setColor(Color.black);
g.setFont(font);
g.drawString(message,40,75);
 }
}
