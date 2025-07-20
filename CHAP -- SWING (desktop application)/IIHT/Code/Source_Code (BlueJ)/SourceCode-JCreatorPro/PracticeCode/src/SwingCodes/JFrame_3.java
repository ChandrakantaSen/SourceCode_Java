import javax.swing.*;

//inheriting JFrame    
public class JFrame_3 extends JFrame
{
	JFrame_3()
	{  
		setSize(400,500);  
		setLayout(null);  
		setVisible(true); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);			 
	}  
	
	public static void main(String[] args) 
	{  
		new JFrame_3();  	
	}
}  