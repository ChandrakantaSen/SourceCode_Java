import java.io.*;
class file_word
{
    public static void main(String args[])throws IOException
    {
        BufferedWriter buf=new BufferedWriter(new FileWriter("rahul.rtf"));
        PrintWriter pr=new PrintWriter(buf);
        pr.println("Hi i am Rahul Jain.");
        pr.close();
    }
}