//loginb is the main class of the package.
//there are total four classes(loginb,start,search,add)
//this address book is made with the help of jdbc-odbc
//frontend is java
//backend is ms access
//compile all the classes and then run the loginb class
//it authenticates the user entry then proceeds

//sudiptaaddress book

package myprojects.addressbook;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class loginb{
public static void main(String args[]){
try{
final TextField tf1,tf2;
Label l1,l2,l3;
Button b1;


final JFrame f = new JFrame("address book");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(800,800);
f.setLayout(null);

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
final Connection con =
DriverManager.getConnection("jdbc:odbc:student","","");//student is the
(data source name) /*procedure:go to cntrl panel,then select
administrative services ,then select odbc,then select or add the dsn.*/
final Statement st = con.createStatement();

Font f1 = new Font("sansserif",Font.BOLD,24);
l3 = new Label("sudiptaADDRESS BOOK");
l3.setBounds(150,10,800,40);
l3.setFont(f1);
f.add(l3);


l1= new Label("USER NAME :");
l1.setBounds(200,200,100,30);
f.add(l1);

 tf1 = new TextField();
tf1.setBounds( 400,200,100,30);
f.add(tf1);

l2= new Label("PASSWORD :");
l2.setBounds(200,250,100,30);
f.add(l2);

 tf2 = new TextField();
tf2.setEchoChar('*');
tf2.setBounds( 400,250,100,30);
f.add(tf2);

b1 = new Button("LOGIN");
b1.setBounds(300,350,50,30);
f.add(b1);
b1.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e){
			try{
			String s1 = tf1.getText();
			String s2 = tf2.getText();
			System.out.println("got data ");
			ResultSet rs = st.executeQuery("Select * From login");
			System.out.println("table select");
			while(rs.next())
			{String s3= rs.getString(1);
			String s4=rs.getString(2);
			System.out.println("data entered"+s1+"	"+s2);
			System.out.println("inside while"+s3+"	"+s4);
			if(s3.equals(s1) && s4.equals(s2))
			{ try{
			 f.hide();
             Start s = new Start();

				}
				catch(Exception e3){}
			}
		    }
			tf1.setText("");
			tf2.setText("");
			}
			catch(Exception e1){System.out.println("ERROR 1"+e1);}
			}
			});
f.show();
}
catch(Exception e2){System.out.println("ERROR 2"+e2);}
}
}
__________________________________________________________________________
______
//class start
package myprojects.addressbook;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import address.*;
public class Start {
public Start() throws Exception{

Button b1,b2;
JFrame jf;

jf=new JFrame("START");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setSize(800,800);
jf.setLayout(null);


Font f1 = new Font("sansserif",Font.BOLD,24);
Label l3 = new Label("sudiptaADDRESS BOOK");
l3.setBounds(150,10,800,40);
l3.setFont(f1);
jf.add(l3);

b1 = new Button("ADD");
b1.setBounds(250,150,100,40);
b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
				Add a = new Add();
				}
				catch(Exception e2){}
				}
				});

b2 = new Button("SEARCH");
b2.setBounds(250,100,100,40);
b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e1) {
				try{
				Search b = new Search();
			}
				catch(Exception e3){}
				}
				});

jf.add(b1);
jf.add(b2);
jf.show();
}
}
__________________________________________________________________________
_______
///class search
package myprojects.addressbook;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Search{
public Search(){

final JFrame jf = new JFrame("Search");
jf.setSize(800,800);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setLayout(null);

Font f1 = new Font("sansserif",Font.BOLD,24);
Label l3 = new Label("sudiptaADDRESS BOOK");
l3.setBounds(150,10,800,40);
l3.setFont(f1);
jf.add(l3);

final TextArea ta = new TextArea();
ta.setBounds(10,120,1000,600);
ta.setEditable(false);
jf.add(ta);

Label l = new Label ("search by name:");
l.setBounds(10,60,100,30);
jf.add(l);

final TextField tf = new TextField();
tf.setBounds(120,60,100,30);
jf.add(tf);


Label l1 = new Label ("TELEPHONE:");
l1.setBounds(240,60,100,30);
jf.add(l1);

final TextField tf1 = new TextField();
tf1.setBounds(360,60,100,30);
jf.add(tf1);

Button b1 = new Button("SEARCH");
b1.setBounds(480,60,50,30);
b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
					try{
				String s6,s,s1,s3,s4,s0="1233";
				Date d;
				Long s2,s5;
				 s = tf.getText();
				s6=tf1.getText();
                                if(s6.equals(""))
                               s5=Long.parseLong(s0);
	                        else
	                        s5 = Long.parseLong(tf1.getText());

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		final Connection con =
DriverManager.getConnection("jdbc:odbc:student","","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * From addressb");
		while(rs.next()){
                s1 = rs.getString(1);
		s2 = rs.getLong(2);
		s3 = rs.getString(3);
		s4 = rs.getString(4);
		d =  rs.getDate(5);
		System.out.println("gotstring");
		if((s1.equals(s))||(s2.equals(s5))){
		System.out.println("string equal");
		ta.append(s1+"		"+ s2+ "		" + s3+ "		" + s4 + "		"+d);
		ta.append("
");
		}//eoif
		}//eowhlie
		}
		catch(Exception e1){System.out.println("ERROR="+e1);}
		}
		});

jf.add(b1);
Button b2 = new Button("ADD");
b2.setBounds(550,60,50,30);
b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
				Add a = new Add();
				}
				catch(Exception e2){}
				}
				});
jf.add(b2);
Button b3 = new Button("EXIT");
b3.setBounds(620,60,50,30);
b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e2) {
				try{
				System.exit(0);
			}
				catch(Exception e3){}
				}
				});
jf.add(b3);

jf.show();
}
}
_________________________________________________________________________
//class add
package myprojects.addressbook;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Add {

public Add() throws Exception{

final TextField tf1,tf2,tf3,tf4,tf5;
Label l1,l2,l3,l4,l5,l6;
Button b1,b2,b3;
final JFrame f;

f= new JFrame("ADDRESS BOOK");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(800,800);
f.setLayout(null);

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
final Connection con =
DriverManager.getConnection("jdbc:odbc:student","","");

Font f1 = new Font("sansserif",Font.BOLD,24);
l6 = new Label("sudiptaADDRESS BOOK");
l6.setBounds(150,10,800,40);
l6.setFont(f1);
f.add(l6);

l1= new Label("NAME :");
l1.setBounds(200,200,100,30);
//l1.setFont(f1);
f.add(l1);

 tf1 = new TextField();
tf1.setBounds( 400,200,100,30);
f.add(tf1);

l2= new Label("PHONE NO. :");

l2.setBounds(200,250,100,30);
f.add(l2);

 tf2 = new TextField();
tf2.setBounds( 400,250,100,30);
f.add(tf2);


l3= new Label("Address :");
l3.setBounds(200,300,100,30);
f.add(l3);

 tf3 = new TextField();
tf3.setBounds( 400,300,100,30);
f.add(tf3);

l4= new Label("Email id:");
l4.setBounds(200,350,100,30);
f.add(l4);

 tf4 = new TextField();
tf4.setBounds( 400,350,100,30);
f.add(tf4);

l5= new Label("Birth date:");
l5.setBounds(200,400,100,30);
f.add(l5);

 tf5 = new TextField();
tf5.setBounds( 400,400,100,30);
f.add(tf5);

b1 = new Button("ENTER");
b1.setBounds(300,450,50,30);
b1.addActionListener( new ActionListener()
			{ public void actionPerformed(ActionEvent e){
				try{
				String s1,s2,s3,s4,s5;
				s1 = tf1.getText();
				s2 = tf2.getText();
				s3 = tf3.getText();
				s4 = tf4.getText();
				s5 = tf5.getText();
PreparedStatement ps = con.prepareStatement("insert into addressb
values(?,?,?,?,?)");
			        ps.setString(1,s1);
				ps.setString(2,s2);
			 	ps.setString(3,s3);
				ps.setString(4,s4);
				ps.setString(5,s5);
			int i = ps.executeUpdate();
			System.out.println("Row Updated:"+i);
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
			}
			catch(Exception e1){System.out.println("ERROR:"+e1);}
			}
			});

f.add(b1);

b2 = new Button("SEARCH");
b2.setBounds(400,450,50,30);
b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e2) {
				try{
				Search b = new Search();
			}
				catch(Exception e3){}
				}
				});
f.add(b2);
b3 = new Button("EXIT");
b3.setBounds(480,450,50,30);
b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e2) {
				try{
				System.exit(0);
			}
				catch(Exception e3){}
				}
				});
f.add(b3);
f.show();
}
}
