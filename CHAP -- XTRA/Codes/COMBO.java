import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
 
public class Compare extends JFrame implements ItemListener { 
        JComboBox combo, lcombo; 
 
        public Compare() { 
                setLayout(null); 
                String a[] = { "Select", "Watches", "Mobiles", "shoes" }; 
                combo = new JComboBox(a); 
                combo.setBounds(50, 50, 100, 20); 
                combo.addItemListener(this); 
                add(combo); 
 
                lcombo = new JComboBox(); 
                lcombo.addItemListener(this); 
                lcombo.setEnabled(false); 
                add(lcombo); 
                lcombo.setBounds(50, 100, 100, 20); 
 
                setSize(300, 300); 
        } 
 
        public void itemStateChanged(ItemEvent e) { 
                String b[] = { "Titan", "HMT" }; 
                String c[] = { "Nokia", "Sony", "Motorola", "Samsung" }; 
                String d[] = { "Liberty", "Action", "Bata", "Campus", "Relaxo" }; 
 
                if (e.getSource() == combo) 
			{ 
                        if (combo.getSelectedItem().equals("Select")) 
				{ 
                                lcombo.setEnabled(false); 

                        }
				 else if (combo.getSelectedItem().equals("Watches")) { 
                                lcombo.setEnabled(true); 
                                lcombo.removeAllItems(); 
                                for (int i = 0; i < b.length; i++) { 
                                        lcombo.addItem(b[i]); 
                                } 
                        } else if (combo.getSelectedItem().equals("Mobiles")) { 
                                lcombo.setEnabled(true); 
                                lcombo.removeAllItems(); 
                                for (int i = 0; i < c.length; i++) { 
                                       // lcombo.removeItem(c[i]); 
                                        lcombo.addItem(c[i]); 
                                } 
                        } else if (combo.getSelectedItem().equals("shoes")) { 
                                lcombo.setEnabled(true); 
                                lcombo.removeAllItems(); 
                                for (int i = 0; i < d.length; i++) { 
                                        lcombo.addItem(d[i]); 
                                } 
                        } 
                } 
        } 
 
        public static void main(String args[]) { 
                (new Compare()).setVisible(true); 
        } 
}