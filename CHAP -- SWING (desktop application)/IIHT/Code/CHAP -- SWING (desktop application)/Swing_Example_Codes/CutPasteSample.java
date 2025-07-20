import java.awt.BorderLayout;
import java.util.Hashtable;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.DefaultEditorKit;

public class CutPasteSample {
  public static void main(String args[]) {
    JFrame frame = new JFrame("Cut/Paste Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField textField = new JTextField();

    frame.add(textField, BorderLayout.NORTH);

    Action actions[] = textField.getActions();

    Action cutAction = findAction(actions, DefaultEditorKit.cutAction);
    Action copyAction = findAction(actions, DefaultEditorKit.copyAction);
    Action pasteAction = findAction(actions, DefaultEditorKit.pasteAction);

    JPanel panel = new JPanel();
    frame.add(panel, BorderLayout.SOUTH);

    JButton cutButton = new JButton(cutAction);
    cutButton.setText("Cut");
    panel.add(cutButton);

    JButton copyButton = new JButton(copyAction);
    copyButton.setText("Copy");
    panel.add(copyButton);

    JButton pasteButton = new JButton(pasteAction);
    pasteButton.setText("Paste");
    panel.add(pasteButton);
    frame.setSize(250, 250);
    frame.setVisible(true);
  }
  
  private static Action findAction(Action actions[], String key) {
    Hashtable<Object, Action> commands = new Hashtable<Object, Action>();
    for (int i = 0; i < actions.length; i++) {
      Action action = actions[i];
      commands.put(action.getValue(Action.NAME), action);
    }
    return commands.get(key);
  }
  
}
