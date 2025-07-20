import java.awt.*;
import java.applet.*;
public class forntlist extends Applet
{ 
String fonts[];
public void init()
{
Toolkit t= Toolkit.getDefaultToolkit();
fonts=t.getFontList();
    }
public void paint(Graphics g)
{
for (int i=0; i<fonts.length;i++)
g.drawString(fonts[i],5,15*(i+i));
     }   }