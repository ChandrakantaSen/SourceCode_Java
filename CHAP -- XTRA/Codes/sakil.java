import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class sakil extends java.applet.Applet
{
  private Button b;

  public void init() 
  {
    b = new Button("Click me");
    add (b);
  }
   public boolean mouseEnter( Event evt, int x, int y)
   {
       b.setLabel("Hello Asad");
       return true;
    }
    public boolean mouseExit( Event evt, int x, int y)
    {
        b.setLabel("Hello Soumen da");
        return true;
    }
  }