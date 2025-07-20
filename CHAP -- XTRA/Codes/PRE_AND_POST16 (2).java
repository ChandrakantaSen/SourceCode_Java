import java.io.*;
class PRE_AND_POST16
{
public static void main(String args[])throws IOException
{
int a=1,b=3,c=8,d,e;
d=--b+(c++)-(a++);
e=--c+(++d);
System.out.println(e);
}

}