import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonTest extends JFrame implements ActionListener {
  JLabel label = new JLabel("The quick brown fox jumps over the lazy dog.");

  private JRadioButton smallButton;

  private JRadioButton mediumButton;

  private JRadioButton largeButton;

  private JRadioButton xlargeButton;

  public RadioButtonTest() {
    setTitle("RadioButtonTest");
    setSize(400, 200);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    JPanel buttonPanel = new JPanel();
    ButtonGroup group = new ButtonGroup();
    smallButton = addRadioButton(buttonPanel, group, "Small", false);
    mediumButton = addRadioButton(buttonPanel, group, "Medium", true);
    largeButton = addRadioButton(buttonPanel, group, "Large", false);
    xlargeButton = addRadioButton(buttonPanel, group, "Extra large", false);
    getContentPane().add(buttonPanel, "South");

    getContentPane().add(label, "Center");
  }

  public JRadioButton addRadioButton(JPanel buttonPanel, ButtonGroup g,
      String buttonName, boolean v) {
    JRadioButton button = new JRadioButton(buttonName, v);
    button.addActionListener(this);
    g.add(button);
    buttonPanel.add(button);
    return button;
  }

  public void actionPerformed(ActionEvent evt) {
    Object source = evt.getSource();
    if (source == smallButton)
      label.setFont(new Font("SansSerif", Font.PLAIN, 8));
    else if (source == mediumButton)
      label.setFont(new Font("SansSerif", Font.PLAIN, 12));
    else if (source == largeButton)
      label.setFont(new Font("SansSerif", Font.PLAIN, 14));
    else if (source == xlargeButton)
      label.setFont(new Font("SansSerif", Font.PLAIN, 18));
  }

  public static void main(String[] args) {
    JFrame frame = new RadioButtonTest();
    frame.show();
  }
}