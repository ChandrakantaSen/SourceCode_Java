import java.io.*;
class file5
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("Reema.mdb"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("reema");
        pr.close();
    }
}