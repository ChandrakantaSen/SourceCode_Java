import java.io.*;
class file_mdb
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("rahul6.mdb"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("hi dis is rahul");
        pr.close();
    }
}