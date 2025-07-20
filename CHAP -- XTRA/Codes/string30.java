import java.io.*;
class string30
{
public static void main(String args[])throws IOException
{
String s="BLUEJ";
int i,l,j;
l=s.length();
for(i=0;i<l;i++)
{
for(j=i;j<l;j++)
{
System.out.print(s.charAt(j)+" ");
    }
    System.out.println();
}
    }
}