//Write a program to create a sequential file named share.dat contaning serip.name and the opening and closing prices per share as follows:
//Seriphame                 Opening price                   Closing price
//ABC                           550.00                          545.00
//XYZ                           290.90                          300.00
//PQR                            65.10                           80.00
                          
                                                                
import java.io.*;
public class serip
{
    public static void main(String args[])throws IOException
    {
    FileWriter fout=new FileWriter("aastha.txt");
    BufferedWriter bout=new BufferedWriter(fout);
    PrintWriter pr=new PrintWriter(bout);
    pr.println("Scrip name");
    pr.println("ABC");
    pr.println("550.00");
    pr.println("545.00");
    pr.println("XYZ");
    pr.println("290.90");
    pr.println("300.00");
    pr.println("PQR");
    pr.println("65.10");
    pr.println("80.00");
    pr.close();
}
    }