//Java code for the scribble applet:
import java.applet.*;
import java.awt.*;
public class Example4 extends java.applet.Applet
{
private int last_x=0;
private int last_y=0;
public boolean mouseDown(Event e,int x,int y)
{
last_x=x;
last_y=y;
return true;
    }
public boolean mouseDrag(Event e,int x,int y)
{
Graphics g=getGraphics();
g.drawLine(last_x,last_y,x,y);
last_x=x;
last_y=y;
return true;
    }

    }