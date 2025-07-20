import javax.swing.*;
import java.awt.event.*;

class textareaex extends JFrame implements ActionListener
{
	JFrame jf = new JFrame("TextArea Example");
	JButton jb = new JButton("count");
	JLabel jl1 = new JLabel();
	JLabel jl2 = new JLabel();
	JTextArea jt = new JTextArea();
	
	textareaex()
	{
		jb.setBounds(80,90,100,100);
		jl1.setBounds(10,100,100,80);
		jl2.setBounds(90,200,200,80);
		jt.setBounds(230,150,100,200);
		
		jf.add(jl1);
		jf.add(jl2);
		jf.add(jb);
		jf.add(jt);
		jf.setSize(600,600);
		jf.setLayout(null);
		jf.setVisible(true);
		
		jb.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String txt = jt.getText();
		String words[]=txt.split("\\s");
		jl1.setText("words:"+words.length);
		jl2.setText("text:"+txt.length()); 
			 
	}
	public static void main (String[] args)
	{
		new textareaex();
	}
		
}