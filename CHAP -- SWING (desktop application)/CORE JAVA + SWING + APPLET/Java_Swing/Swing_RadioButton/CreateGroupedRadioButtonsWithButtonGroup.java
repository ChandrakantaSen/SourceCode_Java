import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class CreateGroupedRadioButtonsWithButtonGroup extends JFrame {

 private static final long serialVersionUID = 1L;

 public CreateGroupedRadioButtonsWithButtonGroup() {

  // set flow layout for the frame
  this.getContentPane().setLayout(new FlowLayout());

  JRadioButton java = new JRadioButton("Java");
  JRadioButton c = new JRadioButton("C/C++");
  JRadioButton net = new JRadioButton(".NET");

  java.setSelected(true);

  ButtonGroup buttonGroup = new ButtonGroup();

  //add radio buttons
  buttonGroup.add(java);
  buttonGroup.add(c);
  buttonGroup.add(net);

  add(java);
  add(c);
  add(net);

 }

 private static void createAndShowGUI() {

  //Create and set up the window.

  JFrame frame = new CreateGroupedRadioButtonsWithButtonGroup();

  //Display the window.

  frame.pack();

  frame.setVisible(true);

  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

 public static void main(String[] args) {

  //Schedule a job for the event-dispatching thread:

  //creating and showing this application's GUI.

  javax.swing.SwingUtilities.invokeLater(new Runnable() {

public void run() {

    createAndShowGUI(); 

}

  });
    }

}