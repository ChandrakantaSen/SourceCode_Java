import java.io.*;
class Prg11
{
public static void main(String args[])throws IOException
{
String s="JEULB";
int i,j,l;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
l=s.length();
for(i=0;i<l;i++)
{
for(j=0;j<=l-i-1;j++)
{
System.out.print(s.charAt(i));
}
    System.out.println();
}
}	
    }
