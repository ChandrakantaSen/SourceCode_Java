import java.io.*;
class PRE_AND_POST23
{
public static void main(String args[])throws IOException
{
int f=12,g=8,h=17,i;
i=--g+(g++)-(f--)+(h++);
System.out.println(i);
}

}