import java.io.*;
class file7
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("Reema.bmp"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("reema");
        pr.close();
    }
}