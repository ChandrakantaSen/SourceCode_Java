import java.awt.BorderLayout;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultEditorKit;

public class UseActionsFromTextComponents {
  public static void main(String args[]) {
    JFrame frame = new JFrame("Use TextAction");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    final JTextArea leftArea = new JTextArea();
    final JTextArea rightArea = new JTextArea();

    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(leftArea),
        new JScrollPane(rightArea));
    splitPane.setDividerLocation(.5);
    
    JMenuBar menuBar = new JMenuBar();
    frame.setJMenuBar(menuBar);
    JMenu menu = new JMenu("Options");
    menuBar.add(menu);
    JMenuItem menuItem;

    Action readAction = leftArea.getActionMap().get(DefaultEditorKit.readOnlyAction);
    menuItem = menu.add(readAction);
    menuItem.setText("Make read-only");
    Action writeAction = leftArea.getActionMap().get(DefaultEditorKit.writableAction);
    menuItem = menu.add(writeAction);
    menuItem.setText("Make writable");
    menu.addSeparator();

    Action cutAction = leftArea.getActionMap().get(DefaultEditorKit.cutAction);
    menuItem = menu.add(cutAction);
    menuItem.setText("Cut");
    Action copyAction = leftArea.getActionMap().get(DefaultEditorKit.copyAction);
    menuItem = menu.add(copyAction);
    menuItem.setText("Copy");
    Action pasteAction = leftArea.getActionMap().get(DefaultEditorKit.pasteAction);
    menuItem = menu.add(pasteAction);
    menuItem.setText("Paste");

    frame.add(splitPane, BorderLayout.CENTER);
    frame.setSize(400, 250);
    frame.setVisible(true);

  }
}

 