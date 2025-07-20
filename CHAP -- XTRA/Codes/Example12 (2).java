//A Java programe to get informationabout a file:

import java.io.*;
public class Example12
{
    public static void main(String argv[])
    {
    System.out.println("Enter a file name:");
    char cc;
    StringBuffer ss=new StringBuffer();
    try
    {
        while((cc=(char)System.in.read())!='\n')
        {
            ss.append(cc);
        }
    }catch(Exception e)
    {
        System.out.println("Error:"+e.toString());
    }
    File file=new File(ss.toString());
    if(file.exists())
    {
        System.out.println("file name   :"+file.getName());
        System.out.println("File path   :"+file.getPath());
        System.out.println("Absolute path :"+file.getAbsolutePath());
        System.out.println("Writable    :"+file.canWrite());
        System.out.println("Readable    :"+file.canRead());
        System.out.println("File length :"+file.length());
    }
    else
    {
        System.out.println("Sorry,file not found");
    }
}
}
        