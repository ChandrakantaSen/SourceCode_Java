import java.io.*;
class bkprg4
{
public static void main (String args[])throws IOException
{
int i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s[]=new String[10];
int t[]=new int[10];
System.out.println("Enter the name nd telephone no.s");
for(i=0;i<10;i++)
{
s[i]=br.readLine();
t[i]=Integer.parseInt(br.readLine());
    }
  System.out.println("NAME\t\tTELEPHONE NO.s");
    for(i=0;i<10;i++)
{
System.out.println(s[i]+"\t\t"+t[i]);
    }
}
    }

    