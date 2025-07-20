import java.io.*;
class string55
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l,j=0,shift;
System.out.println("Enter the string : - ");
s=br.readLine();
System.out.println("Enter the shift backword  : - ");
shift=Integer.parseInt(br.readLine());
l=s.length();
for(i=0;i<l;i++)
{
if((((int)(s.charAt(i))>=65)&&((int)(s.charAt(i))<=90))||(((int)(s.charAt(i))>=97)&&((int)(s.charAt(i))<=122)))
{
k=k+(char)((int)(s.charAt(i))-shift);
}
else
{
k=k+s.charAt(i);
}
}
System.out.println(k);    
}
    }