import java.io.*;
class file_doc
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("rahul1.doc"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("Rahul");
        pr.close();
    }
}