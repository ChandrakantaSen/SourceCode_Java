import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
/**
 *
 * @author Admin
 */
public class AppThread{
 
    /**
     * @param args the command line arguments
     */
 
    JLabel label;
    JLabel j[];
    void init()
    {
        JFrame frm = new JFrame();
        JPanel panel = new JPanel();
        JLabel lab1 = new JLabel();
        JLabel lab2 = new JLabel();
 
         label = new JLabel();
         j = new JLabel[11];
         j[0] = new JLabel();
         j[1] = new JLabel();
         j[2] = new JLabel();
         j[3] = new JLabel();
         j[4] = new JLabel();
         j[5] = new JLabel();
         j[6] = new JLabel();
         j[7] = new JLabel();
         j[8] = new JLabel();
         j[9] = new JLabel();
         j[10] = new JLabel();
         
 
 
              
            
              
             
         
             panel.add(j[11]);
              
        frm.add(panel);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.pack();
//        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
 
    }
 
   void mai()
    {
        for(int i = 0; i<=10 ; i++)
             {
//                label.setText( " " + j[i] + j[1]  + j[2] + j[3] +j[4] + j[5] + j[6]);
 
//                label.setText(" " + i  + "\n");
//                lab1.setText(" " + i);
//                lab2.setText(" " + i);
                     
 
                    j[i].setText(" " + i);
 
             }
 
   }
 
    public static void main(String[] args) {
        // TODO code application logic here
        new AppThread().init();
        new AppThread().mai();
         
        
//
 
 
    }
 
    
}