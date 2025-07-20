import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;
import javax.swing.*;
class JP
{JFrame f=new JFrame("Editor(c)");
 JPanel p=new JPanel();
 public JP()
 {JTextArea txtA=new JTextArea();
     f.add(p);
  f.add(txtA);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setSize(800,500);
  f.setVisible(true);
 }
 public static void main(String[] args)
 {SwingUtilities.invokeLater(new Runnable(){
   public void run()
   {new JP();
   }    
  });
 }
} 