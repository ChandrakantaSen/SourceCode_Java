package All;

import javax.swing.*; 
import java.awt.*; 
public class PieChart extends JApplet 
{ 
public void paint( Graphics g ) 
{ 
// pie 
g.setColor( Color.RED ); 
g.fillArc( 20,20, 300, 300, 20, 90 ); 
g.setColor( Color.YELLOW ); 
g.fillArc( 20,20, 300,300, 110,45 ); 
g.setColor( Color.BLUE ); 
g.fillArc( 20,20, 300,300, 155, 180 ); 
// outline 
 g.setColor( Color.BLACK ); 
 g.drawArc( 20,20, 300, 300, 0, 360 ); 
}
} 