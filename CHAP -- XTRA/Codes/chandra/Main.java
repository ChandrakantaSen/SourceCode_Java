import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int horizontalGap = 20;
        int verticalGap = 10;
        Container contentPane = frame.getContentPane();
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEADING, horizontalGap,
                verticalGap);
        contentPane.setLayout(flowLayout);
        frame.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        for (int i = 1; i <= 5; i++) {
            contentPane.add(new JButton("Button  " + i));
        }
        frame.pack();
        frame.setVisible(true);
    }
}