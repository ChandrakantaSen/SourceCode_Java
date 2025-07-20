import java.io.*;
class file6
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("Reema.jpeg"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("reema");
        pr.close();
    }
}