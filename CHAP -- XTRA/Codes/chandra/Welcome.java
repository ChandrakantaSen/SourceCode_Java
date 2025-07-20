import java.awt.*;
import java.applet.Applet;

public class Welcome extends java.applet.Applet implements Runnable {
   
   Font f = new Font("Arial Black", Font.BOLD, 24);
   Color col = new Color(204,153,0);
   Color back = new Color(249,249,249);
   String wel = new String("WELCOME TO MY SITE");
   Thread runner;
   int x;
   int stringSize;
   
   public void init() {
      setForeground(col);
      setBackground(back);
       setFont(f);
       FontMetrics fm=getFontMetrics(f);
       stringSize=fm.stringWidth(wel);
   }

   public void start() {
      if (runner == null) {
         runner = new Thread(this);
         runner.start();
      }
   }

   public void stop() {
      if (runner != null) {
         runner = null;
      }
   }

   public void run() {
      Thread thisThread = Thread.currentThread();
      x = 10-stringSize;
      int cont = size().width;
      while (runner == thisThread) {
         x = x + 2;
         repaint();
         try {
            Thread.sleep(20);
         } catch (InterruptedException e) { }
         if (x > cont) x = -stringSize;
      }
   }

   public void paint(Graphics screen) {
     
      screen.drawString(wel, x, 25);
   }
}
 

