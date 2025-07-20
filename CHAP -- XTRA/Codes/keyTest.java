0import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class keyTest extends Applet implements KeyListener
{String msg="    ";
     public void init()
    {
   Label lab = new Label ("Enter Characters :");
   add(lab);
  TextField tf = new TextField(20);
  add(tf);
  tf.addKeyListener(this);
     }
public void keyPressed(KeyEvent e)
{}
 public void keyReleased(KeyEvent e)
{}
 public void keyTyped(KeyEvent e)
{msg+=e.getKeyChar();
  showStatus(" Recently typed characters are : " + msg);
  }
     }

