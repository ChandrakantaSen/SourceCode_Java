import java.io.*;
class file
{
    public static void main(String args[])throws IOException
    {
        //BufferedWriter buf=new BufferedWriter(new FileWriter("Reema.txt"));
        PrintWriter pr=new PrintWriter(new BufferedWriter(new FileWriter("Reema.txt")));
        pr.println("reema");
        pr.close();
    }
}