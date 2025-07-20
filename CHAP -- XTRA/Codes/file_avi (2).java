import java.io.*;
class file_avi
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("Rahul5.avi"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("hi dis is rahul");
        pr.close();
    }
}