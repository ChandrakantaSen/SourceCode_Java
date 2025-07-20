//Write a program in java to create a sequential file containing the following information:
    //Country                                   %of people owning P.C.
    //India                                             1.7
    //Japan                                            14.6
    //USA                                              36.0
    //Germany                                          17.4
    //Singapore                                        20.4
    //U.K.                                             21.5
    
    
import java.io.*;
public class country
{
    public static void main(String args[])throws IOException
    {
    FileWriter fout=new FileWriter("INFO.txt");
    BufferedWriter bout=new BufferedWriter(fout);
    PrintWriter pr=new PrintWriter(bout);
    pr.println("Country");
    pr.println();
    pr.println("India");
    pr.println("1.7");
    pr.println("Japan");
    pr.println("14.6");
    pr.println("USA");
    pr.println("36.0");
    pr.println("Germany");
    pr.println("17.4");
    pr.println("Singapore");
    pr.println("20.4");
    pr.println("U.K");
    pr.println("21.5");
    pr.close();
}
    }