import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.sql.*;
import java.util.*;
import java.applet.*;
import java.net.*;
import java.lang.*;

class Inventory extends JFrame
{
	//********* FONTS **************************************
	Font dataFont=new Font("Times New Roman",Font.PLAIN,12);
 	Font titleFont=new	Font("Times	New	Roman",Font.BOLD,14);
 	Font splFont =	new	Font("Arial	Black",Font.BOLD,18);

 	GridBagLayout gridbag = new GridBagLayout();
 	GridBagConstraints c= new GridBagConstraints();
 	Container contentPane = getContentPane();

 	JPanel p0,p1;

 	JMenuBar menuBar = new JMenuBar();
 	//*****************  TEXT BOX  *******************
	JTextField item_code	= new JTextField(5);
	JTextField item_name	= new JTextField(15);
	JTextField rate			= new JTextField(8);
	JTextField quantity		= new JTextField(10);
	JTextField reorder		= new JTextField(10);
	//***************** LABEL   *********************
	JLabel item_codeL	=new JLabel("ITEM CODE  : ");
	JLabel item_nameL	=new JLabel("ITEM NAME  : ");
	JLabel rateL		=new JLabel("RATE       : ");
	JLabel quantityL	=new JLabel("QUANTITY   : ");
	JLabel reorderL		=new JLabel("REORDER NO.: ");
	JLabel heading;

	JLabel Blank= new JLabel(" ");
	JLabel Blank1= new JLabel(" ");
	JLabel Blank2= new JLabel(" ");
	JLabel Blank3= new JLabel(" ");
	JLabel Blank4= new JLabel(" ");
	ImageIcon img = new ImageIcon("back_picture.jpg");
	JLabel	bk_picture 	= new JLabel(img);

	//***************** BUTTONS ********************
	JButton button;
	//JScrollPane scroll = new JScrollPane(address);

	JButton Add_Entry_button = new JButton("Next Item");
	JButton Cancel_button = new JButton("Cancel");
	JButton ok_img_button = new JButton("ok",img);

 	public static void main(String args[])
 	{
 		Inventory obj = new Inventory();
 	}

 	public Inventory()
 	{
 		super("DEPARTMENTAL STORE DETAILS ");
 		setup();
 		setSize(800,600);
 		addWindowListener(new WindowEventHandler());
 		show();
 	}

 	void showpanel()
 	{
 		p1= new JPanel();
 		p1.setBackground(new Color(160,132,18));
		p1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
	    p1.setLayout(gridbag);
	    bk_picture.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
	    p1.add(bk_picture);
		contentPane.add(p1,BorderLayout.CENTER);
		setSize(800,600);
		addWindowListener(new WindowEventHandler());
		show();
 	}

 	void setup()
 	{
 		setupMenuBar();
 		showpanel();
 	}

 	void setupMenuBar()
 	{


 		JMenu ITEM_MASTERMenu=new JMenu("ITEM_AUTHORISATION");
 		ITEM_MASTERMenu.setMnemonic('I');

 		JMenuItem CODE_menu= new JMenuItem("ITEM ENTRY");
 		CODE_menu.addActionListener(new MenuItemHandler());
 		CODE_menu.setMnemonic('C');
 		ITEM_MASTERMenu.add(CODE_menu);


 		JMenuItem NAME_menu= new JMenuItem("ITEM LIST");
 		NAME_menu.addActionListener(new MenuItemHandler());
 		NAME_menu.setMnemonic('N');
 		ITEM_MASTERMenu.add(NAME_menu);

 		JMenuItem DESCRIP_menu= new JMenuItem("REORDER LIST");
 		DESCRIP_menu.addActionListener(new MenuItemHandler());
 		DESCRIP_menu.setMnemonic('D');
 		ITEM_MASTERMenu.add(DESCRIP_menu);


 		menuBar.add(ITEM_MASTERMenu);


 		JMenu VENDOR_MASTERMenu=new JMenu("TRANSACTION");
 		VENDOR_MASTERMenu.setMnemonic('V');

 		JMenuItem VENDOR_CODE_menu= new JMenuItem("ITEM PURCHASE");
 		VENDOR_CODE_menu.addActionListener(new MenuItemHandler());
 		VENDOR_CODE_menu.setMnemonic('v');
 		VENDOR_MASTERMenu.add(VENDOR_CODE_menu);

 		JMenuItem VENDOR_NAME_menu= new JMenuItem("ITEM ISSUE");
 		VENDOR_NAME_menu.addActionListener(new MenuItemHandler());
 		VENDOR_NAME_menu.setMnemonic('B');
 		VENDOR_MASTERMenu.add(VENDOR_NAME_menu);

 		JMenuItem VENDOR_ADDRESS_menu= new JMenuItem("TRANSACTION LIST");
 		VENDOR_ADDRESS_menu.addActionListener(new MenuItemHandler());
 		VENDOR_ADDRESS_menu.setMnemonic('A');
 		VENDOR_MASTERMenu.add(VENDOR_ADDRESS_menu);
 	 	menuBar.add(VENDOR_MASTERMenu);

 		 // HELP MENU //
 		JMenu HELPMenu=new JMenu("HELP");
 		HELPMenu.setMnemonic('H');

 		JMenuItem USER_HELP_menu= new JMenuItem("USER HELP");
 		USER_HELP_menu.addActionListener(new MenuItemHandler());
 		USER_HELP_menu.setMnemonic('U');
 		HELPMenu.add(USER_HELP_menu);

 		JMenuItem WEB_HELP_menu= new JMenuItem("WEB HELP");
 		WEB_HELP_menu.addActionListener(new MenuItemHandler());
 		WEB_HELP_menu.setMnemonic('W');
 		HELPMenu.add(WEB_HELP_menu);

	 	menuBar.add(HELPMenu);
 		//*			EXIT FROM THE SYSTEM	*//

 		JMenu EXITMenu = new JMenu("EXIT");
 		EXITMenu.setMnemonic('X');

 		JMenuItem System_Exit_menu= new JMenuItem("System_Exit");
 		System_Exit_menu.addActionListener(new MenuItemHandler());
 		System_Exit_menu.setMnemonic('S');
 		EXITMenu.add(System_Exit_menu);

 		menuBar.add(EXITMenu);

 		setJMenuBar(menuBar);
 	}

    void Item_Master_details()
	{
		p0= new JPanel();
		p0.setBackground(new Color(153,207,247));
		p0.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
		p0.setLayout(gridbag);

		JLabel heading = new JLabel("ITEM ENTRY");
		heading.setFont(splFont);
		heading.setForeground(new Color(130,65,0));

		Label(heading,4,0);		p0.add(heading);

		Label(item_codeL,1,4);		p0.add(item_codeL);
		text(item_code,4,4);		p0.add(item_code);
		Label(Blank,0,10);			p0.add(Blank);

		Label(item_nameL,0,15);		p0.add(item_nameL);
		text(item_name,4,15);		p0.add(item_name);
		Label(Blank1,0,20);			p0.add(Blank1);

		Label(rateL,0,25);			p0.add(rateL);
		text(rate,4,25);			p0.add(rate);
		Label(Blank2,0,30);			p0.add(Blank2);

		Label(quantityL,0,35);		p0.add(quantityL);
		text(quantity,4,35);		p0.add(quantity);
		Label(Blank3,0,40);			p0.add(Blank3);

		Label(reorderL,0,45);		p0.add(reorderL);
		text(reorder,4,45);			p0.add(reorder);
		Label(Blank4,0,45);			p0.add(Blank4);



		Add_Entry_button.setForeground(new Color(130,65,0)); // for fore color
		Add_Entry_button.setBackground(new Color(236,215,134));// for back color
		button(Add_Entry_button,1,55);	p0.add(Add_Entry_button);
		Add_Entry_button.addActionListener(new ButtonHandler());

		Cancel_button.setForeground(new Color(130,65,0)); // for color
		Cancel_button.setBackground(new Color(236,215,134));
		button(Cancel_button,4,55);p0.add(Cancel_button);
		Cancel_button.addActionListener(new ButtonHandler());

		contentPane.add(p0);
		setSize(800,600);

		addWindowListener(new WindowEventHandler());
		show();
	}

 	void text(JTextField s,int m,int n)
		{
			c.ipady=2;
			c.ipadx=2;
			c.weighty=0.0;
			c.anchor = GridBagConstraints.WEST;
			c.gridwidth = 2;
			c.gridx=m;
			c.gridy=n;
			gridbag.setConstraints(s,c);

		}

	void Label(JLabel s,int m,int n)
		{
			c.ipady=2;
			c.ipadx=2;
			c.weighty=0.0;
			c.anchor = GridBagConstraints.WEST;
			c.gridwidth = 2;
			c.gridx=m;
			c.gridy=n;
			gridbag.setConstraints(s,c);

		}

	void button(JButton s, int m , int n)
		{
			c.ipady=2;
			c.ipadx=2;
			c.weighty=0.0;
			c.anchor = GridBagConstraints.WEST;
			c.gridwidth = 2;
			c.gridx=m;
			c.gridy=n;
			gridbag.setConstraints(s,c);

		}

	void text_area(JTextArea s, int m, int n)
	{
			c.ipady=2;
			c.ipadx=2;
			c.weighty=0.0;
			c.anchor = GridBagConstraints.WEST;
			c.gridwidth = 2;
			c.gridx=m;
			c.gridy=n;
			gridbag.setConstraints(s,c);


	}

	void text_area_scroll(JScrollPane s, int m, int n)
	 {
	 		c.ipady=2;
			c.ipadx=2;
			c.weighty=0.0;
			c.anchor = GridBagConstraints.WEST;
			c.gridwidth = 2;
			c.gridx=m;
			c.gridy=n;
			gridbag.setConstraints(s,c);
	}
//************************************************************
    void  entry_item_database()
    {

	try{
		//int no=generate_memo_no("DESPATCH_IN",memo_no.getText());
		String v_item_code=item_code.getText();
		String v_item_name=item_name.getText();
		String v_rate=rate.getText();
		String v_quantity=quantity.getText();
		String v_reorder=reorder.getText();

		String sql="INSERT INTO ITEM_MASTER VALUES('" +v_item_code+"','" +v_item_name+"',"+v_rate+","+v_quantity+","+v_reorder+")";
		System.out.println(sql);
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn=DriverManager.getConnection("jdbc:odbc:oraclejava","INVENTORY","INVENTORY");
        Statement stmt=conn.createStatement();
        boolean hasresult=stmt.execute(sql);
        conn.close();
		}
	catch(Exception ex){
		JButton button1=new JButton("RECTIFY IT");
		String title="System Alert";
		String message="Sorry ! Input Error";
		int messagetype=JOptionPane.WARNING_MESSAGE;
		System.out.println(messagetype);
		JOptionPane.showMessageDialog(button1,message,title,messagetype);
	 }

    item_code.setText("");
    item_name.setText("");
    rate.setText("");
    quantity.setText("");
  	reorder.setText("");
//  	item_code.setFocus();
}

    void item_list()
    {
 	     p0=new JPanel();
 	     p0.setBackground(new Color(153,207,247));
 	     p0.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
         p0.setFont(splFont);
         p0.setLayout(gridbag);

        JLabel heading = new JLabel("ITEM LIST");
		heading.setFont(splFont);
		heading.setForeground(new Color(130,65,0));

	//	Label(heading,1,0);		p0.add(heading);
	//    Label(Blank,2,0);		p0.add(Blank);

	     try{


		        String heading1[]=new String[5];

		           	 heading1[0]="ITEM MO";
              	     heading1[1]="ITEM NAME";
              	     heading1[2]="RATE(Rs.)";
              	     heading1[3]="QUANTITY";
              	     heading1[4]="REORDER";

              	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		        Connection conn=DriverManager.getConnection("jdbc:odbc:oraclejava","INVENTORY","INVENTORY");
                Statement stmt=conn.createStatement();
                String sql="SELECT * FROM ITEM_MASTER";
                boolean hasresult=stmt.execute(sql);
                int i=0;
                if(hasresult)
	              {

                    ResultSet result=stmt.getResultSet();
                    ResultSetMetaData rmeta=result.getMetaData();
                    int r=no_of_rows("SELECT COUNT(*) FROM ITEM_MASTER");
                    int c=rmeta.getColumnCount();
                    String data1[][]=new String[r][c];

                    while(result.next())
           	        {
           		      int k=0,l=0;
           		           do{
           			              l=k+1;
           			              data1[i][k]=result.getString(l);
           			              k++;
           		   	         }while(k<c);
           		        i++;
           	        }

           		       JTable table1=new JTable(data1,heading1);
           		       int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
           		       int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
           		       JScrollPane jsp= new JScrollPane(table1,v,h);
	 			       p0.add(jsp,BorderLayout.CENTER);
	 			       p0.add(table1);

                  }

            conn.close();

		   }
		   catch(IllegalArgumentException ar)
		   {
		   }

	       catch(Exception ex){
	       	                    p0.removeAll();
                                contentPane.removeAll();
      	                        System.out.println("Unsuccessful to show the query result");
                               }


	       button(Cancel_button,4,50);p0.add(Cancel_button);
		   Cancel_button.addActionListener(new ButtonHandler());

           contentPane.add(p0,BorderLayout.CENTER);
           pack();
           setSize(800,600);
           addWindowListener(new WindowEventHandler());
           show();


}

    void item_reorder_list()
    {
 	     p0=new JPanel();
 	     p0.setBackground(new Color(153,207,247));
 	     p0.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
         p0.setFont(splFont);
         p0.setLayout(gridbag);

        JLabel heading = new JLabel("ITEM REORDER LIST");
		heading.setFont(splFont);
		heading.setForeground(new Color(130,65,0));

	//	Label(heading,1,0);		p0.add(heading);
	//    Label(Blank,2,0);		p0.add(Blank);
	     try{


		        String heading1[]=new String[5];

		           	 heading1[0]="ITEM MO";
              	     heading1[1]="ITEM NAME";
              	     heading1[2]="RATE";
              	     heading1[3]="QUANTITY";
              	     heading1[4]="REORDER";

              	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		        Connection conn=DriverManager.getConnection("jdbc:odbc:oraclejava","INVENTORY","INVENTORY");
                Statement stmt=conn.createStatement();
                String sql="SELECT * FROM ITEM_MASTER WHERE QUANTITY<=RE_ORDER";
                boolean hasresult=stmt.execute(sql);
                int i=0;
                if(hasresult)
	              {

                    ResultSet result=stmt.getResultSet();
                    ResultSetMetaData rmeta=result.getMetaData();
                    int r=no_of_rows("SELECT COUNT(*) FROM ITEM_MASTER WHERE QUANTITY<=RE_ORDER");
                    int c=rmeta.getColumnCount();
                    String data1[][]=new String[r][c];
                    while(result.next())
           	         {
           		       int k=0,l=0;
           			             do
           			           {
           			              l=k+1;
           			              data1[i][k]=result.getString(l);
           			              k++;
           		   	            }while(k<c);

           		   	    i++;
           	           }

           		       JTable table1=new JTable(data1,heading1);
           		       int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
           		       int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
           		       JScrollPane jsp= new JScrollPane(table1,v,h);
	 			       p0.add(jsp,BorderLayout.CENTER);
	 			       p0.add(table1);

                  }

            conn.close();

		   }
		   catch(IllegalArgumentException ar)
		   {
		   }

	       catch(Exception ex){
	       	                    p0.removeAll();
                                contentPane.removeAll();
      	                        System.out.println("Unsuccessful to show the query result");
                               }

           button(Cancel_button,4,50);p0.add(Cancel_button);
		   Cancel_button.addActionListener(new ButtonHandler());

           contentPane.add(p0,BorderLayout.CENTER);
           pack();
           setSize(800,600);
           addWindowListener(new WindowEventHandler());
           show();


}

    int no_of_rows(String sql)  throws Exception
    {
 	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn=DriverManager.getConnection("jdbc:odbc:oraclejava","INVENTORY","INVENTORY");
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(sql);

        String s1=" ";
        int no=0;
        while(rs.next())
        {
        	s1=rs.getString(1).trim();
        }

        no=Integer.parseInt(s1);
		conn.close();
		return no;
}
	void url()
	{
		System.out.println("Function in URL");





	}

//************************************************************
class WindowEventHandler extends WindowAdapter
{
  public void windowClosing(WindowEvent e)
  {
   System.exit(0);
   }
}

/////////////////////////////////////////////////////////////////////////////

class ButtonHandler implements ActionListener
{
   public void actionPerformed(ActionEvent ev)
  {

    String s=ev.getActionCommand();

   if(s=="Cancel")   // Called from logo_screen()
    {
    p0.removeAll();
    contentPane.removeAll();
    showpanel();
    }
   if(s=="Next Item")
   {
   	entry_item_database();
   }


  }
}

//////////////////////////////////////////////////////////////////////////////

class MenuItemHandler implements ActionListener
{
   public void actionPerformed(ActionEvent e)
  {
   	String s=e.getActionCommand();

   	if(s=="System_Exit")
   	{
	  	System.exit(0);
   	}
   	if (s=="ITEM ENTRY")
   	{
   		contentPane.removeAll();
   		Item_Master_details();
   	}
   	if (s=="ITEM LIST")
   	{
   		contentPane.removeAll();
   		item_list();
   	}
    if (s=="REORDER LIST")
   	{
   		contentPane.removeAll();
   		item_reorder_list();
   	}
   	if (s=="WEB HELP")
   	{
   		url();
 	}
   	if (s=="USER HELP")
   	{
   		System.out.println ("USER help testing");

   	}

  }

}
}