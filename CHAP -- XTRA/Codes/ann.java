
import java.applet.*;
import java.awt.*;
public class ann extends java.applet.Applet
{
public void paint (Graphics g)
{

String subject = "Lmiit";
char text [ ] = subject.toCharArray ( );
g.setFont (new Font ("Times New Roman", Font.PLAIN,20));

int k=0;
for (int i=0, l=text.length; i<l; i++, k+=10)
{

g.drawChars (text,i,l,40+k,40);
try
{
Thread.sleep (1000);
    }
    catch (Exception e)
{
 } }
setBackground (new Color (200,210,220));	
g.drawString (subject,40,40);
try{
Thread.sleep (1000);
    }
    catch (Exception e)
    {
    }
        repaint();
    }
}    
      

