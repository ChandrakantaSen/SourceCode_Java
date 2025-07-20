import javax.swing.*;
import java.awt.event.*; 

class actioncode
{
	public static void main (String[] args) {


	JFrame jf = new JFrame("my code");
	//jf.setBounds(500,500,500,500);
	
	JButton jb = new JButton("click here");
	jb.setBounds(50,100,95,30);
	
	JButton jb1 = new JButton("clear");
	jb1.setBounds(150,100,95,30);
	
	JTextField jt = new JTextField();
	jt.setBounds(50,50, 150,20);
	
	JTextField jt1 = new JTextField();
	jt1.setBounds(50,70,150,20);
	
	JLabel jl;
	jl = new JLabel("hello");
	jl.setBounds(50,150, 100,30); 
	
	jb.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e)
			{
			//	jt.setText("within textfield");
			String txt1,txt2;
			double num,num1,res;
			
			txt1 = jt.getText();
			num = Integer.parseInt(txt1);
			
			txt2 = jt1.getText();
			num1 = Integer.parseInt(txt2);
			
			res = (num + num1);
			jl.setText(res+"");
				
			}
	});
	
	
	jb1.addActionListener(new ActionListener()
	{
		 	
		public void actionperformed(ActionEvent e)
		{
			jt.setText("");
			jt1.setText("");
			jl.setText("");
		}
	});
	jf.add(jb);
	jf.add(jb1);
	jf.add(jt);
	jf.add(jt1);
	jf.add(jl);
	jf.setSize(500,500);
	jf.setLayout(null);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);	
}
}