import java.io.*;
import java.lang.*;
class christina
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s;
System.out.println("enter your name");
s=br.readLine();
int l=s.length();
for(int i=1;i<=(l/2)+1;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(" ");
    }
    for(int k=i;k<=(l+1)-i;k++)
    {
        System.out.println(s.charAt(k));
    }
    System.out.println();
}
    }
}