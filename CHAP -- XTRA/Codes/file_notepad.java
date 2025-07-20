import java.io.*;
class file_notepad
{
    public static void main(String args[])throws IOException
    {
/*        BufferedWriter buf=new BufferedWriter(new FileWriter("nam.txt"));
        PrintWriter pr=new PrintWriter(buf);*/
PrintWriter pr=new PrintWriter(new BufferedWriter(new FileWriter("nam.txt")));
        pr.println("hi is namrata");
        pr.close();
    }
} 