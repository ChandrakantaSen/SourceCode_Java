import java.applet.*;
import java.awt.*;
import java.util.*;
public class bulls extends Applet
{
public void paint(Graphics g)
{
setBackground (new Color(122,125,130));
int rectleft,reetop, rectheight,rectwidth;
int rectleft1,recttop1,rectheight1,rectwidth1;
int appletheight=this.getsize().Height;
int appletwidth=this.getsize().width;
try
{
int i,j;
for(i=8,j=0; i>0&&j<=8;i--,j++)
{
g.setColor(Color.red);
rectheight=appletHeight*i/16;
rectwidth=appletwidth*i/16;
rectleft=(appletwidth/4)-(i*appletwidth)/32;
recttop=appletHeight/4-i*appletheight/32;
g.fillOval(rectleft,rectTop,rectwidth,rectHeight);
g.fillOval(rectleft,rectTop,rectwidth,rectHeight);
Thread.sleep(1000);
setBackground(new Color(122+i,125+i+130+i));
    }
for(i=0,j=8;i<=8&&j>=0;i++,j--)
 {
 g.setColor(Color.red);
 rectHeight=appletHeight*i/16;
 rectwidth=appletwith*i/16;
 rectleft=applet.width/4-i*appletwidth/32;
 rectTop=appletHeight/4-i*appletHeight/32;
 rectHeight1=appletHeight*j/16;
 rectwidth1=appletwidth*j/16;
 rectwidth1=appletwidth *j/32;
 rectLeft1=appletWhidth-j*apletwidth/32;
 rectTop=appletHeigth/2-j*apletHeight/32;
 g.filloval(rectLeft,rectTop.rectWidth,rectHeight);
 Thread.sleep(1000);
 setBackground(new Color(122+i,125+i,130+i));
}
     }
     catch (Exception e)
     {
        }
        repaint();
    }
}

 
