import javax.swing.*;  

public class JFrame_1 
{  
	public static void main(String[] args) 
	{  
		//creating instance of JFrame
		JFrame f=new JFrame("JFrame Title Section");  
        f.setSize(400,500);  
		//using no layout managers  
		f.setLayout(null);
		f.setVisible(true);//making the frame visible 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}  
}  