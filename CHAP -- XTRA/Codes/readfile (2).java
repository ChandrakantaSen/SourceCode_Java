//Write a programe in java to read this file,computer and display the total marks of each student,along with his name.

import java.io.*;
public class readfile
{
    public static void main(String args[])throws IOException
    {
    FileReader f=new FileReader("Name.txt");
    BufferedReader buf=new BufferedReader(f);
    String h;
    while((h=buf.readLine())!=null)
    {
        String mr1=buf.readLine();
        String mr2=buf.readLine();
        String mr3=buf.readLine();
        int mk1=Integer.parseInt(mr1);
        int mk2=Integer.parseInt(mr2);
        int mk3=Integer.parseInt(mr3);
        int tot=mk1+mk2+mk3;
        System.out.println(h);
        System.out.println(tot);
    }
    f.close();
}
    }