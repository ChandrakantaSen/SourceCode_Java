import javax.swing.*;
import java.awt.event.*;

class calci extends JFrame implements ActionListener
{
			int num1 = 0,num2 = 0,result=0,flag = 0;
			static JFrame jf=new JFrame("calculator");
			JButton jb1=new JButton("1");
			JButton jb2=new JButton("2");
			JButton jplus=new JButton("+");
			JButton jequal=new JButton("=");
			JTextField jt=new JTextField();
			
			calci()
			{
				jb1.setBounds(200,200,50,50);
				jb2.setBounds(100,100,50,50);
				jt.setBounds(200,50,30,30);
				jplus.setBounds(150,100,50,50);
				jequal.setBounds(180,100,50,50);
				
				jf.add(jb1);
				jf.add(jb2);
				jf.add(jt);
				jf.add(jplus);
				jf.add(jequal);
				
				jf.setSize(300,300);
				jf.setLayout(null);
				jf.setVisible(true);
				
				jb1.addActionListener(this);
				jb2.addActionListener(this);
				jplus.addActionListener(this);
				jequal.addActionListener(this);
			}
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()== jb1)
				{
					num1 = Integer.parseInt(jb1.getText());
					//System.out.println(""+num1);
					jt.setText(Integer.toString(num1));
					flag = 1;
				}
			
				if(e.getSource()== jb2)
				{
					num2 = Integer.parseInt(jb2.getText());
					//System.out.println(""+num1);
					jt.setText(Integer.toString(num2));
					flag = 2;
				}
				
				if(e.getSource()== jplus)
				{
					int temp = 0;
					if(flag == 1)
					{
						temp = num1;
					}
					else if(flag == 2)
					{
						temp = num2;
					}
					else
					{
						temp = 0;
					}
					result = result + temp;
					//System.out.println(""+result);
				//	flag=0;
					
				}
				if(e.getSource()==jequal)
				{
					int lstVal = Integer.parseInt(jt.getText());
					result += lstVal;
					jt.setText(Integer.toString(result));
				}
				
			}
				
			public static void main (String[] args) 
				{
					new calci();
					jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
		
}