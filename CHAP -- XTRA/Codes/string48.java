import java.io.*;
class string48
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l,j=0;
System.out.println("Enter the string : - ");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
if(((int)(s.charAt(i))>=65)&&((int)(s.charAt(i))<=90))
{
k=k+(char)((int)(s.charAt(i))+32);
}
else if(((int)(s.charAt(i))>=97)&&((int)(s.charAt(i))<=122))
{
k=k+(char)((int)(s.charAt(i))-32);
}
else
{
k=k+s.charAt(i);
}
}
System.out.println(k);    
}
    }