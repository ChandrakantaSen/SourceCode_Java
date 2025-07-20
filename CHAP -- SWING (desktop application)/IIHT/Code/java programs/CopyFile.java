import java.io.*;

class CopyFile
{
             public static void main(String args[])throws IOException
        {
              FileInputStream Fread =new FileInputStream("File1.txt");
              FileOutputStream Fwrite=new FileOutputStream("File2.txt") ;
              System.out.println("File is Copied");
              int c;
              while((c=Fread.read())!=-1)
              Fwrite.write((char)c);
              Fread.close();
              Fwrite.close();
         }
}