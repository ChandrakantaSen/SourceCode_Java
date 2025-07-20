import java.awt.*;
import java.applet.*;
import java.util.*;
public class bullseye extends Applet
{
public void paint(Graphics g)
{
int rleft,rtop,rheight,rwidth,aheight,awidth;
aheight=this.getSize().height;
awidth=this.getSize().width;
for( int i=8;i>=0;i--)
{
if((i%2)==0)
g.setColor(Color.green);
else
g.setColor(Color.red);
rheight=aheight *i/8;
rwidth=awidth *i/8;
rleft=awidth/2-i*awidth/16;
rtop=aheight/2-i*aheight/16;
g.fillOval(rleft,rtop,rwidth,rheight);
    }
}
    }