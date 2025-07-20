import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.applet.Applet;
import java.lang.*;

/*<applet code=twentyseven.class width=700 height=700>
</applet>
*/

public class twentyseven extends Applet implements Runnable
   {
int i,k;
Thread tt;
public void start()
      {
      try{
tt=new Thread(this);
tt.start();
}catch(Exception e){}
       }
public void run()
            {
while(true)
 {              
for(i=0;i<=600;i++)
{
try
  {
Thread.sleep(3);
repaint();
   }catch(Exception e1){}
                 }
for(i=600;i>=0;i--)
{ 
try
{
Thread.sleep(3);
repaint();
}catch(Exception e2){}
}                  
}
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.fillOval(120,(i+15),50,50);
}
}

