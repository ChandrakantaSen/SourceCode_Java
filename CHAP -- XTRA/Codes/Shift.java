import java.io.*;
class Shift
{
public static void main (String args[]) throws IOException
{
String s,p=" ";
int ch,n,k=0,i,l;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter your choice");
ch=Integer.parseInt (br.readLine());
System.out.println ("Enter the Shift");
n=Integer.parseInt (br.readLine());
System.out.println ("Enter the string");
s=br.readLine ();
l=s.length();
switch (ch)
{
case 1:
for (i=0;i<l;i++)
{
k=(int)(s.charAt(i));
if ((k==65)&&(k==90))
{
k=k+n;
if ((k>90))
{
k=k-26;
}
    }
if ((k==97)&&(k==122))
{
k=k+n;
if ((k>122))
    {
    k=k-26;
}
 p=p+(char)(k);
}
System.out.println(p);
    }
break; 
case 2:
for (i=0;i<l;i++)
{
k=(int)(s.charAt(i));
if ((k==65)&&(k==90))
{
k=k-n;
if ((k<90))
{
k=k+26;
}
}
else if ((k==97)&&(k==122))
{
k=k-n;
if ((k<122))
{
k=k+26;
    }
 p=p+(char)(k);
}
System.out.println (p);
}
break;
default :
System.out.println ("Wrong choice");
      }
    }
}