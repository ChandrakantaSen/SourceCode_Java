//A Jav program to create a subdirectory and a file in it:

import java.io.*;
public class examplefile
{
public static final PrintStream ps=System.out;
public static void main(String argv[])throws IOException
{
    File dd=new File ("country");
    checkDirectory(dd);
    checkFile("country/state");
}
static void checkFile(String ss)
{
File ff=new File(ss);
if(!ff.exists())
{
    ps.println("File"+ff.getName()+"does not exist");
    FileOutputStream fos;
    try
    {
        fos=new FileOutputStream(ff);
        fos.write(' ');
    }catch(IOException ioe)
    {
        ps.println("IOException:");
    }
    }
    else
    {
        ps.println("File"+ff.getName()+"already exists");
    }
}
static void checkDirectory(File dd)throws IOException
{
boolean success;
if(!dd.exists())
{
ps.println("Directory"+dd.getName()+"does not exist");
if(success=dd.mkdir())
{
ps.println("Have created directory"+dd.getName());
    }
    else
    {
        ps.println("Failed to create directory"+dd.getName());
    }
}
else
{
ps.println(dd.getName()+"exist already");
if(dd.isDirectory())
{
ps.println("and is a directory");
    }else
    ps.println("and is a file");
    throw new IOException();
}
    }
}

