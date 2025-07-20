import java.io.*;
class PRE_AND_POST17
{
public static void main(String args[])throws IOException
{
int f=4,g=7,h;
h=--f+(g++)-(f++)-(--g);
System.out.println(h);
}

}