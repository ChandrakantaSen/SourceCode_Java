import java.awt.event.*;  
import javax.swing.*;    

public class Code2
{  
	public static void main(String[] args) 
	{  
		JFrame jf = new JFrame("my code");
		//jf.setBounds(500,500,500,500);
	
		JButton jb = new JButton("click here");
		jb.setBounds(50,100,95,30);
	
		JTextField jt = new JTextField();
		jt.setBounds(50,50, 150,20);
		
		JLabel l1;  
    	l1=new JLabel("First Label.");  
    	l1.setBounds(50,150, 100,30);  
		
		
		
		
		jf.add(jb);
		jf.add(jt);
		jf.add(l1);
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);	
	}
}
  