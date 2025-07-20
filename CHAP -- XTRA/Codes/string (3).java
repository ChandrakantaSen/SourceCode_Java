 import java.io.*;
class string
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
String a;
System.out.println("enter any string");
a=in.readLine();
int l=a.length();
for(int i=0;i<l/2;i++)
{
for(int j=1;j<l/2;j++)
System.out.print(" ");
System.out.println(a.charAt(i));
    }
   System.out.println(a);
for(int k=l/2+1;k<l;k++)
{
for (int j=1;j<l/2;j++)
System.out.print(" ");
System.out.println(a.charAt(k));
   
}
    }
}



    


    


