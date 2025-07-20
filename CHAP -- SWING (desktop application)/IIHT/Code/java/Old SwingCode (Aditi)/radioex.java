import javax.swing.*;
import java.awt.event.*;

class radioex extends JFrame implements ActionListener
{
		JFrame jf=new JFrame("radioButton Example");
		JRadioButton jr1=new JRadioButton("PizzaHut");
		JRadioButton jr2=new JRadioButton("Dominos");
		JButton jb = new JButton("click here");
	radioex()
	{
	    
		jr1.setBounds(50,50,100,100);
		jr2.setBounds(140,50,100,100);
		jb.setBounds(150,150,100,20);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(jr1);
		bg.add(jr2);
		jf.add(jr1);
		jf.add(jr2);
		jf.add(jb);
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
		
		jb.addActionListener(this);
			
	}
	public void actionPerformed(ActionEvent e)
	{
		if(jr1.isSelected())
		{
			JOptionPane.showMessageDialog(this,"welcome to the PizzaHut");
		}
		if(jr2.isSelected())
		{
			JOptionPane.showMessageDialog(this,"welcome to the dominos");
		}
	}
	
	public static void main (String[] args) 
		{
			new radioex();
		}

}