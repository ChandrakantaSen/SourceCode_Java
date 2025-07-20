import javax.swing.*;
  
public class JFrame_2 
{  
	JFrame f;  
	JFrame_2()
	{  
		f=new JFrame("Hello");  
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}  
	public static void main(String[] args) 
	{  
		new JFrame_2();  
	}  
}  