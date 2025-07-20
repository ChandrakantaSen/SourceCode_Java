import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame
{
    public ComboBox()
    {
        super("ComboBox");
        getContentPane().setLayout(new BorderLayout());

        Vector cars = new Vector();
        cars.addElement("1");
        cars.addElement("2");
        cars.addElement("3");

        getContentPane().add(new JComboBox(cars));

        WindowListener wndCloser = new WindowAdapter() 
            {
                public void windowClosing(WindowEvent e) 
                {
                    System.exit(0);
                }
            };
        addWindowListener(wndCloser);

        // setResizable(false);
        pack();
        setVisible(true);
    }

    public static void main(String argv[]) 
    {
        new ComboBox();
    }
}