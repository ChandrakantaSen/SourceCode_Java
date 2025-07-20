import java.util.Date;
import java.awt.*;

public class nineteen extends Frame
   {
      Date d;
        public static void main(String ar[])
          {
            nineteen dd=new nineteen();
            dd.setLayout(new FlowLayout());
              dd.setSize(500,500);
              dd.show();
          }
            public void paint(Graphics g)
               {
                 d=new Date();
                 g.drawString("Hour: "+d.getHours(),100,100);
                 g.drawString("Minute: "+d.getMinutes(),200,100);
                 g.drawString("Second: "+d.getSeconds(),300,100);
               }
   }

