import java.io.*;
class string29
{
public static void main(String args[])throws IOException
{
String s="BLUEJ";
int i,l,j;
l=s.length();
for(i=l-1;i>=0;i--)
{
for(j=i;j<l;j++)
{
System.out.print(s.charAt(i)+" ");
    }
    System.out.println();
}
    }
}