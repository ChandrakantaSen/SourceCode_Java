import java.io.*;
class file_ppt
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("rahul6.ppt"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("hi dis is rahul");
        pr.close();
    }
}