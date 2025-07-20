import java.io.*;
class file_jpeg
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("Rahul.jpeg"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("hi is r.j.....");
        pr.close();
    }
}