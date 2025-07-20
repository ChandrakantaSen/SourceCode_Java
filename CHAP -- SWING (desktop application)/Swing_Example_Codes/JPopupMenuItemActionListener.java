import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

// Define ActionListener
class PopupActionListener implements ActionListener {
  public void actionPerformed(ActionEvent actionEvent) {
    System.out.println("Selected: " + actionEvent.getActionCommand());
  }
}

public class JPopupMenuItemActionListener {
  public static void main(final String args[]) {
    JFrame frame = new JFrame("PopupSample Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Create popup menu, attach popup menu listener
    JPopupMenu popupMenu = new JPopupMenu("Title");
    ActionListener actionListener = new PopupActionListener();

    // Cut
    JMenuItem cutMenuItem = new JMenuItem("Cut");
    popupMenu.add(cutMenuItem);

    // Copy
    JMenuItem copyMenuItem = new JMenuItem("Copy");
    copyMenuItem.addActionListener(actionListener);
    popupMenu.add(copyMenuItem);
    // Paste
    JMenuItem pasteMenuItem = new JMenuItem("Paste");
    pasteMenuItem.addActionListener(actionListener);
    pasteMenuItem.setEnabled(false);
    popupMenu.add(pasteMenuItem);

    // Separator
    popupMenu.addSeparator();

    // Find
    JMenuItem findMenuItem = new JMenuItem("Find");
    findMenuItem.addActionListener(actionListener);
    popupMenu.add(findMenuItem);
    JButton label = new JButton();
    frame.add(label);
    label.setComponentPopupMenu(popupMenu);

    frame.setSize(350, 250);
    frame.setVisible(true);
  }
}

