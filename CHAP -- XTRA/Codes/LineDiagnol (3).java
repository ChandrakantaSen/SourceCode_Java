package All;

import java.awt.*;    // access the Graphics object
import javax.swing.*;  // access to JApplet
public class LineDiagnol extends JApplet 
{ 
    public void paint( Graphics g ) 
    { 
        g.drawLine( 0,0, 50, 50 ); 
    } 
}