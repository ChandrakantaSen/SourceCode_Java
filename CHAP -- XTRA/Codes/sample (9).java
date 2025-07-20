/**
 *Text genereted by Simple GUI Extension for BlueJ
 */
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;

public class sample extends JFrame {
    private JMenuBar menuBar;
    private JButton button1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield5;

    //Constructor 
    public sample(){

        setTitle("sample");
        setSize(315,172);
        //menu generate method
        generateMenu();
        setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(315,172));
        contentPane.setBackground(new Color(192,192,192));

        button1 = new JButton();
        button1.setBounds(73,129,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Add");
        button1.setVisible(true);
        //Set action for button click
        //Call defined method
        button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    add(evt);
                }
            });

        label2 = new JLabel();
        label2.setBounds(5,43,80,32);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Number 1");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(6,81,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Number 2");
        label3.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(71,41,232,37);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);

        textfield2 = new JTextField();
        textfield2.setBounds(73,84,229,32);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("sansserif",0,12));
        textfield2.setText("");
        textfield2.setVisible(true);

        textfield5 = new JTextField();
        textfield5.setBounds(168,128,136,32);
        textfield5.setBackground(new Color(255,255,255));
        textfield5.setForeground(new Color(0,0,0));
        textfield5.setEnabled(true);
        textfield5.setFont(new Font("sansserif",0,12));
        textfield5.setText("");
        textfield5.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(button1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(textfield1);
        contentPane.add(textfield2);
        contentPane.add(textfield5);

        //adding panel to JFrame and seting of window position and close operation
        getContentPane().add(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    //Method actionPerformed for button1
    private void add (ActionEvent evt) 
    {
        int x=Integer.parseInt(textfield1.getText());
		int y=Integer.parseInt(textfield2.getText());
		int sum=(x + y);
		String s1 = String.valueOf(sum);
		textfield5.setText(s1);
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");

        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }


    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new sample();
                }
            });
    }

}