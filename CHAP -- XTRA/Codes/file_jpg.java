import java.io.*;
class file_jpg
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("Rahul4.jpg"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("hi dis rahul");
        pr.close();
    }
}