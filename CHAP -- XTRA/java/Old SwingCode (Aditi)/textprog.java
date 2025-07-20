import java.awt.*;
import javax.swing.*;
public class textprog extends JFrame
{
	JLabel L1;
	textprog()
	{
		L1 = new JLabel("hallo world");
	}
	public static void main (String[] args)
		 {
		 	textprog t1 = new textprog();
		 	Container c1=t1.getContentPane();
		 	c1.add(t1.L1);
		 	c1.setBackground(Color.green);
		 	t1.setSize(300,300);
		 	t1.setVisible(true);
		 }
}