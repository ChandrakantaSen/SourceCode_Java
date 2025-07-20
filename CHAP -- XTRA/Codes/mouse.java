import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 public class mouseEvent extends JApplet implements MouseListener, MouseMotionListener
{
         public void init()
        {
            addMouseListener(this);
            addMouseMotionListener(this);
         }

            public void mouseClicked(MouseEvent e)
          {
            showStatus("Mouse has been clicked at " + e.getX()+ "," + e.getY());
        }

public void mouseEntered(MouseEvent e)
{
   showStatus("Mouse has been Entered at " + e.getX()+ "," + e.getY());
    // For loop:to make sure mouse entered is on status bar for a few sec
            for (int i= 0; i<1000000; i++);
 } 

public void mouseExited (MouseEvent e)
{
   showStatus ("Mouse has been Exited at " + e.getX()+ "," + e.getY());
 }

public void mousePressed(MouseEvent e)
{
   showStatus ("Mouse pressed at " + e.getX()+ "," + e.getY());
 }

public void mouseReleased(MouseEvent e)
{
   showStatus("Mouse released at " + e.getX()+ "," + e.getY());
 }

public void mouseDragged(MouseEvent e)
{
   showStatus("Mouse dragged at " + e.getX()+ "," + e.getY());
 }

public void mouseMoved(MouseEvent e)
{
   showStatus("Mouse moved at " + e.getX()+ "," + e.getY());
 }
}


