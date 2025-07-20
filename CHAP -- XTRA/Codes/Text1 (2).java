package All;

import java.awt.*;   // access the Graphics object
import javax.swing.*; // access to JApplet
public class Text1 extends JApplet 
{ 
public void paint ( Graphics gr ) 
{ 
gr.drawString ( "Hello Worldling", 0, 0 ); 
 gr.drawString ( "Java rocks", 0, 50 );  
 gr.drawString ( "Skiing is fun", 50, 50 );  
 gr.drawString( "To be, or not 2 B", 50, 65 );
} 
}