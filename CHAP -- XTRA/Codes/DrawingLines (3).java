import java.applet.*;
import java.awt.*;

public class DrawingLines extends Applet 
{

   int width, height;

   public void init() {
      width = getSize().width;
      height = getSize().height;
      setBackground( Color.black );
   }

   public void paint( Graphics g ) {
      g.setColor( Color.orange );
      for ( int i = 0; i < 20; ++i ) {
         g.drawLine( width, height, i * width / 5, 0 );
      }
   }
}