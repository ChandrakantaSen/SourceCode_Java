import java.awt.*;
import java.applet.*;
import java.util.*;
public class arm extends java.applet
{
String subject="Lmiit Computer Training Institute";
char text []=subject.toCharArray();
Font f=new Font("Tahoma",Font.BOLD,20);
int k=0;
g.setFont();
for(int i=0,len=text.length();i<len;i++,k+=10)
{
getBackground(new Color(200+i)210+i,220+i));
g.drawChars(text,i,1,40+k,40);
    
try
{
Thread.sleep(1000);
    }
catch(Exception e)
{
    }
}
 setBackground(new Color(200,210,220));
 g.drawString (subject,40,40);
 try
 {
 Thread.sleep(1000);
}
Catch(Exception e)
{
    }
    repaint();
}
    }