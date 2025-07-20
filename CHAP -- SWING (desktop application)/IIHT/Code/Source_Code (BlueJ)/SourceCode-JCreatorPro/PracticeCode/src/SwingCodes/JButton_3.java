import javax.swing.*;
     
public class JButton_3
{    
	JButton_3()
	{    
		JFrame f=new JFrame("Button Example");            
		JButton b=new JButton(new ImageIcon("C:\\Users\\IIHT 2\\Pictures\\images1.jpg"));    
		b.setBounds(100,100,100, 100);    
		f.add(b);    
		f.setSize(500,500);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }   
    	      
	public static void main(String[] args) 
	{    
    	new JButton_3();    
	}    
}    