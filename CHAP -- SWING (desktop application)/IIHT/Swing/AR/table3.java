import javax.swing.*;
import javax.swing.table.*;
//import java.awt.*;
import java.awt.event.*;

public class table3 extends JFrame implements ActionListener
{
	JFrame frame = new JFrame();
	JTable table = new JTable(); 
	Object[] columns = {"Id","First Name","Last Name","Age"};
	DefaultTableModel model = new DefaultTableModel();
	
	JTextField textId = new JTextField();
	JTextField textFname = new JTextField();
	JTextField textLname = new JTextField();
	JTextField textAge = new JTextField();
	
	JButton btnAdd = new JButton("Add");
	//JButton btndel = new JButton("delete");        
	        
	        
	   table3()
	   {
	   	  	textId.setBounds(20, 220, 100, 25);
	        textFname.setBounds(20, 250, 100, 25);
	        textLname.setBounds(20, 280, 100, 25);
	        textAge.setBounds(20, 310, 100, 25);
	        
	        btnAdd.setBounds(150, 220, 100, 25);
	       
	        JScrollPane pane = new JScrollPane(table);
	        pane.setBounds(0, 0, 880, 200);
	        
	        frame.setLayout(null);
	        
	        frame.add(pane);
	        
	        frame.add(textId);
	        frame.add(textFname);
	        frame.add(textLname);
	        frame.add(textAge);
	    
	        frame.add(btnAdd);
	       
	        Object[] row = new Object[4];
	        btnAdd.addActionListener(this);
	        //btndel.addActionListener(this);
	         frame.setSize(900,400);
	        frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true); 
	   }   
	   	 public void actionPerformed(ActionEvent e) 
	    		 	{
		             
		               /* row[0] = textId.getText();
		                row[1] = textFname.getText();
		                row[2] = textLname.getText();
		                row[3] = textAge.getText();
		                
		                
		                model.addRow(row);*/
	           		 }
	           		 
    public static void main(String[] args)
    	{
	    	
	        model.setColumnIdentifiers(columns);
	        
	        table.setModel(model);
	        new table3();
	        
	        
	        
	        
	          
	      
	        
	        /*button add row*/
	       // btnAdd.addActionListener(new ActionListener()
	        	 //@Override
	    		
	        //}//);
	        
	        
		            /*public void actionPerformed(ActionEvent e) 
	            	{
	            
		                // i = the index of the selected row
		                int i = table.getSelectedRow();
		                if(i >= 0)
		                	{
			                    // remove a row from jtable
			                    model.removeRow(i);
	                		}
	               		 else
	                		{
	                    		 System.out.println("Delete Error");
	                		}
	            	}
	        	});*/
	        
	       
	    }
}