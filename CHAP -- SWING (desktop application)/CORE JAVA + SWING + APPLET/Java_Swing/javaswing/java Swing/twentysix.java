import java.applet.*;
import java.awt.*;


public class twentysix extends Applet implements Runnable
   {
      String message;
      Thread thread;
        public void init()
           {
             message=getParameter("msg");
           }
         public void start()
           {
             if(thread==null)
                {
                  thread=new Thread(this);
                  thread.start();
                }
           }
           public void run()
              {
                Graphics g=getGraphics();
                int i=0;
                   while(true)
                      {
                        g.setColor(Color.black);
                        g.drawString(message,5*i,100);
                          try
                             {
                               Thread.sleep(100);
                             }catch(InterruptedException e){}
                             g.setColor(Color.lightGray);
                             g.drawString(message,5*i,100);
                             i++;
                               if(i>79)
                                  i=0;
                      }
              }
   }
