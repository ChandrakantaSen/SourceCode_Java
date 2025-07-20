import java.applet.*;
import java.awt.*;
import java.util.*;
public class polygonDemo extends Applet
{
int []xpoints={95,65,40};
int []ypoints={100,60,44};
public void init()
{


    }
    public void paint(Graphics g)
    {
        setBackground(Color.cyan);
       g.drawPolygon(xpoints,ypoints,3);
    }
      }