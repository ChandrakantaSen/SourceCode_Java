import java.applet.*;
import java.awt.*;
public class bullseye5 extends Applet
{
public void paint(Graphics g)
{
setBackground (new Color(122,125,130));
int rectleft,recttop, rectheight,rectwidth;
int rectleft1=0,recttop1=0,rectheight1=0,rectwidth1=0;
int appletHeight=this.getSize().height;
int appletWidth=this.getSize().width;
try
{
int i,j;
for(i=8,j=0; i>0&&j<=8;i--,j++)
{
g.setColor(Color.red);
rectheight=(appletHeight*i)/16;
rectwidth=(appletWidth*i)/16;
rectleft=(appletWidth/4)-(i*appletWidth)/32;
recttop=(appletHeight/4)-(i*appletHeight)/32;
g.fillOval(rectleft,recttop,rectwidth,rectheight);
g.fillOval(rectleft1,recttop1,rectwidth1,rectheight1);
Thread.sleep(1000);
setBackground(new Color(122+i,125+i,130+i));
    }
for(i=0,j=8;i<=8&&j>=0;i++,j--)
 {
 g.setColor(Color.blue);
 rectheight=appletHeight*i/16;
 rectwidth=appletWidth*i/16;
 rectleft=(appletWidth/4)-(i*appletWidth)/32;
recttop=(appletHeight/4)-(i*appletHeight)/32;
 rectheight1=(appletHeight*j)/16;
 rectwidth1=(appletWidth*j)/16;
 rectwidth1=(appletWidth *j)/32;
 rectleft1=appletWidth-j*appletWidth/32;
 recttop=(appletHeight/2)-(j*appletHeight)/32;
 g.fillOval(rectleft,recttop,rectwidth,rectheight);
 Thread.sleep(100);
 setBackground(new Color(122+i,125+i,130+i));
}
     }
     catch (Exception e)
     {
        }
        repaint();
    }
}

 
