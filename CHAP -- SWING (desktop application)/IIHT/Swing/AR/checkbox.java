import java.awt.event.*;
import javax.swing.*;

class checkbox extends JFrame 
{
	JFrame jf=new JFrame("Menu list:");
	JCheckBox jcb1=new JCheckBox("veg combo @150");
	JCheckBox jcb2=new JCheckBox("non-veg combo @200");
	JCheckBox jcb3=new JCheckBox("large nonveg combo @300");
	
	checkbox()
	{
		jcb1.setBounds(20,100,140,120);
		jcb2.setBounds(30,200,170,150);
		jcb3.setBounds(50,300,190,170);
		
		jf.add(jcb1);
		jf.add(jcb2);
		jf.add(jcb3);
		
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
	}
	public static void main (String[] args) 
		{
			new checkbox();
		}
	
	
}