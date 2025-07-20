import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Jlabel {
    
   private JFrame mainFrame;
   private JPanel mainPanel;

   public Jlabel(){
      initializeUI();
   }

   public static void main(String[] args){
      Jlabel  demo = new Jlabel();      
      demo.showLabelDemo();
   }

   private void initializeUI(){
      mainFrame = new JFrame("Java Swing Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      mainPanel = new JPanel();
      mainPanel.setLayout(new FlowLayout());

      mainFrame.add(mainPanel);
      mainFrame.setVisible(true);  
   }

   private void showLabelDemo(){
	   
      JLabel label  = new JLabel("", JLabel.CENTER);        
      label.setText("Welcome to Swing Tutorial.");
      label.setOpaque(true);
      label.setBackground(Color.YELLOW);
      label.setForeground(Color.BLACK);
      mainPanel.add(label);
      mainFrame.setVisible(true);  
   }
}

