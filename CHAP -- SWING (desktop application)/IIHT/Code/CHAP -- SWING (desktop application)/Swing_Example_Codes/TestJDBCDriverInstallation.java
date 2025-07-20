import javax.swing.JOptionPane;
import java.sql.*;
import java.io.*;

	public class TestJDBCDriverInstallation {

	   public static void main(String[] args) 
	   {
		  StringBuffer output  = new StringBuffer();
		 output.append("Testing oracle driver installation ");
		  try {
			  String className = "sun.jdbc.odbc.JdbcOdbcDriver";
		
			  Class driverObject = Class.forName(className);
			  output.append("Driver : "+driverObject);
			  output.append("Driver Installation Successful");
			  JOptionPane.showMessageDialog(null, output);
		    } 
		    catch (Exception e)
		    {
		    	output  = new StringBuffer();
		    	output.append("Driver Installation FAILED\n");
		    	JOptionPane.showMessageDialog(null, output);
	   System.out.println("Failed: Driver Error: " + e.getMessage());
		  }
	    }
	}
