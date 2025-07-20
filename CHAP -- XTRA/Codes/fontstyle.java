import java.awt.*;
import java.applet.*;
public class fontstyle extends Applet
{
String fonts[];
public void init ()
{
Toolkit t=Toolkit. getDefaultToolkit();
fonts=t.getFontList();
    }
public void paint(Graphics g)
{
for(int i=0;i<fonts.length;i++)
{
Font f=new Font(fonts[i],Font.BOLD,14);
g.setFont(f);
g.drawString (fonts[i],5,15*(i+1));

    }
}
    }