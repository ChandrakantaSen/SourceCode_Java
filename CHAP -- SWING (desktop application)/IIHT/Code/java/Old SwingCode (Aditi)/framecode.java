import javax.swing.*;
import java.awt.event.*;

class framecode extends JFrame implements ActionListener
{
		static JFrame jf = new JFrame("hello");
		JButton jb1 = new JButton("ok");
		JTextField jt = new JTextField();
		JButton jb2 = new JButton("submit");
		
		framecode()
		{	
			jb1.setBounds(100,100,30,30);	
			jb2.setBounds(180,180,30,30);
			jt.setBounds(200,50,200,200);	  	
			
			jf.add(jb1);
			jf.add(jb2);
	 		jf.add(jt);	
			jf.setSize(500,500);
	 		jf.setLayout(null);
	 		jf.setVisible(true);
	 		
	 		jb1.addActionListener(this);
	 		jb2.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e)
		{
				
			if (e.getSource() == jb1)
			{
				jt.setText("JB1");
			}
			else if (e.getSource() == jb2)
			{
				jt.setText("JB2");
			}
			else
			{
				jt.setText("ELSE");
			}
			
		}
		
	public static void main (String[] args) 
	{
		new framecode();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}