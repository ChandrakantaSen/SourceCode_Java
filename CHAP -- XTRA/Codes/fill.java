
import java.awt.*;
import java.applet.*;
import java.util.*;
public class fill extends Applet
{
Random t;
public void paint(Graphics g)
{
t=new Random();
int aheight=this.getSize().height;
int awidth=this.getSize().width;
int rheight=aheight/3;
int rwidth=awidth/3;
int rtop=(aheight-rheight)/2;
int rleft=(awidth-rwidth)/2;
for(int i=0;i<100000;i++)
 {
g.fillRect(rleft,rtop,rwidth-1,rheight-1);
    }
//}
  //   }
// g.fillRect(rleft,rtop,rwidth-1,rheight-1);
 g.clearRect (rleft, rtop,rwidth-1,rheight-1);
 }
    }
        