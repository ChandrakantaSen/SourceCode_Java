import java.sql.*;
class MsAccessTest {
	public static void main(String args[]) {
		String username="";
		String password="";
		try {
			// loading driver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// Connection set up with database with dsn name as user
			Connection	c = DriverManager.getConnection("jdbc:odbc:user",username,password);
			// Creating statement for the connection to use sql queries
			Statement st = c.createStatement();
			// Executing sql query using the created statement over the table user_details located in the database pointing by the dsn
			ResultSet rs = st.executeQuery("SELECT * from user_details");
			// Accessing the result of query execution
			while(rs.next())
			{
				username = rs.getString(1);
				System.out.println(username);
			}
			// Closing the statement and connection
			st.close();
			c.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}

