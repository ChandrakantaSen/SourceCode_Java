//Update the above file to include the following records.
    //China                                     0.2
    //Israel                                   14.3
    
import java.io.*;
public class countryname
{
    public static void main(String args[])throws IOException
    {
    FileWriter f=new FileWriter("INFO.txt",true);
    BufferedWriter b=new BufferedWriter(f);
    PrintWriter p=new PrintWriter(b);
    p.println("China");
    p.println("0.2");
    p.println("Israel");
    p.println("14.3");
    p.flush();
    f.close();
}
}