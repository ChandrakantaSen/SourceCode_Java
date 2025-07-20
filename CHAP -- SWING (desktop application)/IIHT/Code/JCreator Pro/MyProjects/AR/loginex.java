import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

class loginex extends JFrame implements ActionListener
{
static	JFrame jf=new JFrame("USER CREDENTIALS:");
	JLabel jl1=new JLabel("USERNAME:");
	JLabel jl2=new JLabel("PASSWORD:");
	JLabel jl3=new JLabel();
	JTextField jt1=new JTextField();
	//JTextField jt2=new JTextField();
	JPasswordField jt2 = new JPasswordField(20);
	JButton jb=new JButton("LOGIN");
	
	loginex()
	{
		jl1.setBounds(50,30,150,150);
		jl2.setBounds(50,90,150,150);
		jl3.setBounds(50,250,150,150);
		//jl3.setBackground(Color.red);
		jt1.setBounds(70,30,100,20);
		jt2.setBounds(70,90,100,20);
		jb.setBounds(150,200,150,150);
		
		jf.add(jl1);
		jf.add(jl2);
		jf.add(jl3);
		jf.add(jt1);
		jf.add(jt2);
		jf.add(jb);
		
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
		
		jb.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent e)
	{
		String num;
        num = jt1.getText();
        
        String pwd = new String(jt2.getPassword());
        
        //jl3.setText(pwd+"");
        if("admin".equals(num) && "1234".equals(pwd))
        {
        	 
            jl3.setText("Login Successful...!");
            new loginex().setVisible(true);
        }
        else
        {
            jl3.setText("Error: Username and password wrong...!");
        }
        
        System.out.println("hello");
	}
	public static void main (String[] args) 
		{
			new loginex();
		}
	
}