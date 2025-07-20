/* import the java.applet class (necessary for all applets) */

import java.applet.*;

/* import the java.awt (Abstract Windows Toolkit) classes */

import java.awt.*;

/* declare a class Marquee that can use all variables and functions
   from the Applet class.  The Runnable interface is needed to 
   provide functions that will allow for the execution of the
   applet; the Runnable function used here is run(). */

public class Marquee extends Applet implements Runnable {

/* define a Thread, t.  Think of a Thread as a process; it can be
   started and stopped as necessary within the code. */

  Thread t;

/* define a String, msg, to hold the text we wish to scroll */

  String msg = "Welcome to the Wonderful World of JAVA!";

/* define an integer, msgWidth, to hold the length of the string
   in pixels. */

  int msgWidth;

/* define an integer, pos, to hold the current X position of the 
  text. */

  int pos;

/* define an integer, yLoc, to hold the Y position of the text. */ 

  int yLoc = 15;

/* init is the first function called in a Java applet. */

public void init()
  {

/* resize the applet window to 400x20 */

    resize(400, 20);

/* set the Background color of the applet to white in the form 
   (Red, Green, Blue) with integer values ranging from 0-255. */

    setBackground(new Color(255, 255, 255));

/* use the getFontMetrics function to get the width of the 
   string, in pixels. */
    
    msgWidth = getFontMetrics(getFont()).stringWidth(msg);

/* set the intital position of the text to the right side of 
   the applet window. */
    
    pos = size().width;

/* set t to be a new Thread within 'this,' the Marquee class. */
    
    t = new Thread(this);

/* start the thread.  This calls the run() function. */
    
    t.start();
  }


/* the paint function is called whenever the window needs
   to be updated; the repaint() statement also calls this
   function.  Here, we use it to draw the msg string at
   the coordinates specified by the pos and yLoc variables. */

public void paint(Graphics g)
  {
    g.drawString(msg, pos, yLoc);
  }


/* t.start() calls the run() function.  Here, the while loop
   will iterate continuously; each iteration will repaint the
   applet (drawing the string five pixels to the left of its
   previous location), and pause for 100 milliseconds.  If the
   complete string has scrolled off to the left side of the applet 
   window (pos <= -msgWidth), reposition the string to the 
   right side of the applet window. */


  public void run()
  {
    while(true)
    {
      repaint();
      pos -= 5;
      try
      {
        t.sleep(100);
      }
      catch(Exception e)
      {
      }
      if (pos <= -msgWidth)
      {
        pos = size().width;
      }
    }
  }
}