import java.applet.*;
import java.awt.*;
public class Example4 extends java.applet.Applet
{
private int Last_x=0;
private int Last_y=0;
public boolean mouseDown(Event e,int x,int y)
{
Last_x=x;
Last_y=y;
return true;
}
public boolean mouseDrag(Event e,int x,int y)
{
Graphics g=getGraphics();
g.drawLine(Last_x,Last_y,x,y);
Last_x=x;
Last_y=y;
return true;
}
}
