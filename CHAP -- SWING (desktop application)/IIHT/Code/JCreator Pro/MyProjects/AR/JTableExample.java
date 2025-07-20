import javax.swing.*;
import java.awt.event.*;
class JTableExample
{
	
	JFrame jf = new JFrame("table example");
	JTextField jtxt1 = new JTextField();
	JTextField jtxt2 = new JTextField();
	JTextField jtxt3 = new JTextField();
	
	//String data[][]= new String[3][3] ;   
    //String column[]={"ID","NAME","SALARY"};       
    	
    String data[][]={ {"101","Amit","670000"},{"102","Jai","780000"},{"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"}; 	
    	
    	
	JTable jt = new JTable(data,column);
	JScrollPane sp=new JScrollPane(jt);   
		
	JTableExample()
	{
		jtxt1.setBounds(20,30,30,50); 
		jtxt2.setBounds(20,90,30,50);
		jtxt3.setBounds(20,150,30,50);
		jt.setBounds(20,250,100,300);
    	jf.add(sp);
    	jf.add(jtxt1); 
    	jf.add(jtxt2);          
		jf.add(jtxt3); 
			
		/*String n1;
		int num;
		n1=jtxt1.getText();
		num=Integer.parseInt(n1);
		
		String n2;
		n2=jtxt2.getText();
		
		String n3;
		int num1;
		n3=jtxt3.getText();
		num1=Integer.parseInt(n3);*/
		
		//jf.add(jt);
		jf.setSize(1000,1000);
		jf.setLayout(null);
		jf.setVisible(true);
	}
	public static void main (String[] args)
	{
		new JTableExample();
	}	
}