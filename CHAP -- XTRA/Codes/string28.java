import java.io.*;
class string28
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int i,l,ch,j;
System.out.println("    Menu   ");
System.out.println("Press 1 for triangle in increasing order");
System.out.println("Press 2 for inverted triangle");
System.out.println("Enter the choice");
ch=Integer.parseInt(br.readLine());
switch (ch)
{
case 1:
 s="BLUEJ";
l=s.length();
for(i=0;i<l;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(s.charAt(i)+" ");
    }
    System.out.println();
}
break;
case 2:
 s="BLUEJ";
l=s.length();
for(i=0;i<l;i++)
{
for(j=0;j<l-i;j++)
{
System.out.print(s.charAt(j)+" ");
    }
    System.out.println();
}
break;
default :
System.out.println("Wrong Input");
break;
    }
}
    }