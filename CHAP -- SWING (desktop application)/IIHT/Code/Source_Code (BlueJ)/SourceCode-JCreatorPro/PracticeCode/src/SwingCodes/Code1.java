import javax.swing.*;

class Code1
{
	public static void main (String[] args)
	{
		JFrame jf = new JFrame("Button Example"); 
		//jf.setBounds(500,100,500,500);
		jf.setSize(400,400);
		JButton jb = new JButton("click here");
		jb.setBounds(50,100,95,30);
		
			
			
		jf.add(jb);  
    	
    	jf.setLayout(null);  
    	jf.setVisible(true);   
    	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE); 
	}	
}