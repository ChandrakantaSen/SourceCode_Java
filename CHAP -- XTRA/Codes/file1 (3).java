import java.io.*;
class file1
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("Reema.rtf"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("reema");
        pr.close();
    }
}