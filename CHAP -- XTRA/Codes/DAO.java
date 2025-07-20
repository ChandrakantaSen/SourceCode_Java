import java.sql.*;
public class UserLogin {
public static void main(String[] args) {
try {
// Load MS accces driver class
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

// C:\\databaseFileName.accdb" - location of your database 
String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "C:\\bank.accdb";

// specify url, username, pasword - make sure these are valid 
Connection conn = DriverManager.getConnection(url, "username", "password");

System.out.println("Connection Succesfull");
} catch (Exception e) {
System.err.println("Got an exception! ");
System.err.println(e.getMessage());

}}}