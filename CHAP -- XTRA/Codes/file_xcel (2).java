import java.io.*;
class file_xcel
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("Rahul3.xls"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("hi its me rahul");
        pr.close();
    }
}