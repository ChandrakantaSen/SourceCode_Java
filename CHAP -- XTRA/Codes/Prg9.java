import java.io.*;
class Prg9
{
public static void main(String args[])throws IOException
{
String s="BLUEJ";
int i,j,l;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
l=s.length();
for(i=0;i<l;i++)
{
for(j=0;j<=l-i-1;j++)
{
System.out.print(s.charAt(j));
}
    System.out.println();
}
}	
    }