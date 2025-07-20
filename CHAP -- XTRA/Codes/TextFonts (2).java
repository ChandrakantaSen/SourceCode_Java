package All;

import java.awt.*; 
import javax.swing.*; 
public class TextFonts extends JApplet 
{ 
public void paint ( Graphics g ) 
{ 
g.drawString ("Hello World",0,10 ); 
Font small = new Font( "Serif", Font.PLAIN, 8 ); 
g.setFont( small ); 
g.drawString ("Java rocks", 0,50 ); 
Font big = new Font( "SanSerif", Font.BOLD + Font.ITALIC, 36 ); 
g.setFont( big );
g.drawString ( "Skiing is fun", 50, 50 ); 
} 
}