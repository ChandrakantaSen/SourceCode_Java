import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionExample {
  public static void main(String args[]) {
    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    } catch (Exception e) {
      System.out.println("JDBC-ODBC driver failed to load.");
      return;
    }

    try {
      Connection con = DriverManager.getConnection("jdbc:odbc:Inventory", "", "");
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
