//A Java programe that uses RandomAccessFile class to print the contents of a file on the screen.

import java.io.*;
public class Example13
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
    RandomAccessFile file=new RandomAccessFile(ss.toString(),"rw");
    while(file.getFilePointer()<file.length())
    {
        System.out.println(file.readLine());
    }
}catch(Exception e)
{
System.out.println("Error:"+e.toString());
    }
}
}
        