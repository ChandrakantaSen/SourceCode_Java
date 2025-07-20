import java.lang.String;
import java.io.*;
class sqa27
{
public static void main(String args[])
{ String a;
sqa27 object1=new sqa27();
System.out.println("Enter any string");
a=object1.readLine();
int l=a.length;
for (int i=0;i<=l/2;i++)
{
for (int j=l;j<=l/2;j++)

System.out.print(" ");

System.out.println(a.charAt(i));
}
System.out.print("a");
for (int i=l/2+1;i<l;i++)
{
for(int j=1;j<l/2;j++)
System.out.print(" ");
System.out.println(a.charAt(i));
}
}
}
