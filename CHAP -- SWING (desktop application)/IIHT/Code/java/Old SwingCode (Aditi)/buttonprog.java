import java.awt.*;
import javax.swing.*;
class buttonprog extends JFrame
{
	static JButton jb;
	buttonprog()
	{
		jb = new JButton("Submit");
		setSize(50,50);
		
	}
	
	public static void main (String[] args)
	{
		 	buttonprog b1 = new buttonprog();
		 	//jb.setBounds(100,100,20,30);
		 	//jb.setSize(50,50);
		 	Container c1 = b1.getContentPane();
		 	c1.add(b1.jb);
		 	c1.setBackground(Color.pink);
		 	b1.setSize(1000,1000);
		 	b1.setVisible(true);
		 }
}



































