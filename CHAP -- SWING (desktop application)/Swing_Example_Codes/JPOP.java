import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.*;
public class JPOP
{JFrame f=new JFrame("Editor(c)");
 private JPopupMenu popm;
 private Toolkit tk;
 public JPOP()
 {JTextArea txtA=new JTextArea();
  popm=new JPopupMenu();
  tk=f.getToolkit();
  JMenuItem pm1=new JMenuItem("Close");
  pm1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae)
   {System.exit(0);
   }
  });
  popm.add(pm1);
  f.add(txtA);
  txtA.addMouseListener(new MouseAdapter(){
   public void mouseReleased(MouseEvent me)
   {if(me.getButton()==me.BUTTON3)
    {popm.show(me.getComponent(),me.getX(),me.getY());
    }
   }
  });
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setSize(800,500);
  f.setVisible(true);
 }
 public static void main(String[] args)
 {SwingUtilities.invokeLater(new Runnable(){
   public void run()
   {new JPOP();
   }    
  });
 }
} 