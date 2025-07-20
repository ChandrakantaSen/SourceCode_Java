import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Swing_Radio_Button_Test 
{
  public static void main(String args[]) 
  {
    JFrame frame = new JFrame();
    Container contentPane = frame.getContentPane();
    contentPane.setLayout(new GridLayout(5, 5));
    ButtonGroup group = new ButtonGroup();
    JRadioButton option = new JRadioButton("French Fries", true);
    group.add(option);
    contentPane.add(option);
    option = new JRadioButton("Onion Rings", false);
    group.add(option);
    contentPane.add(option);
    option = new JRadioButton("Ice Cream", false);
    group.add(option);
    contentPane.add(option);
    frame.setSize(250, 250);
    frame.show();
  }
}
           
         
    
  