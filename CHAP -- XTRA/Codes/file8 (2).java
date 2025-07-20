import java.io.*;
class file8
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("Reema.jpg"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("reema");
        pr.close();
    }
}