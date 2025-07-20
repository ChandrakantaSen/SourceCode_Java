import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabelForComboBox extends JPanel {
  public LabelForComboBox() {
    JLabel lbl = new JLabel("Color:");
    lbl.setDisplayedMnemonic('c');
    add(lbl);
    add(Box.createHorizontalStrut(20));
    JComboBox cbColor = new JComboBox();
    cbColor.addItem("red");
    cbColor.addItem("blue");
    lbl.setLabelFor(cbColor);
    add(cbColor);
  }

  public static void main(String[] a)
  {
    JFrame f = new JFrame();
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    f.getContentPane().add(new LabelForComboBox());
    f.pack();
    f.setSize(new Dimension(300, 200));
    f.show();

  }
}