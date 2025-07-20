import java.io.*;
class file_bmp
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("Rahul.bmp"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("hi dis is rahul");
        pr.close();
    }
}