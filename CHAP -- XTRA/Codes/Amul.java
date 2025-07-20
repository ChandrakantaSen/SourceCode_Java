import java.awt.*;
import java.applet.*;
import java.util.*;
public class Amul extends Applet
{
public void paint(Graphics g)
{
String s="WE ARE LEARNING COMPUTER EDUCATION";
char ac[]=s.toCharArray();
g.setFont(new Font("Script MT Bold",30,20));
int i=0;
setBackground (new Color(100,200,10));
int j=0;
for(int k=ac.length;j<k;)
{
g.drawChars(ac,j,1,40+i,40);
try
{
Thread.sleep(500L);
    }
catch(Exception exception)
{
    }
    j++;
    i+=15;
}
    repaint();
}
        }