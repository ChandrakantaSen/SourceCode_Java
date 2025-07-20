//Upgrade the file to include the following records:
//HXZ                   595.0                   269.0
//TSC                   900.0                    49.0

import java.io.*;
public class seripname
{
    public static void main(String args[])throws IOException
    {
    FileWriter f=new FileWriter("aastha.txt",true);
    BufferedWriter b=new BufferedWriter(f);
    PrintWriter p=new PrintWriter(b);
    p.println("HXZ");
    p.println("595.0");
    p.println("269.0");
    p.println("TSC");
    p.println("900.0");
    p.println("49.0");
    p.flush();
    f.close();
}
}