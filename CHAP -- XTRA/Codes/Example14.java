//A Java program to append names to a file already contaning a few names:

import java.io.*;
public class Example14
{
public static void main(String argv[])
{
    RandomAccessFile rf;
    try
    {
        rf=new RandomAccessFile("student.dat","rw");
        rf.seek(rf.length());
        rf.writeBytes("Tom\nDick\nHarry\n");
        rf.close();
    }catch(Exception e)
        {
            System.out.println("Error:"+e.toString());
        }
    }
}