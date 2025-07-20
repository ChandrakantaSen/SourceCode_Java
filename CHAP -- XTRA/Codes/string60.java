import java.io.*;
class string60
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l,j;
System.out.println("Enter the string : - ");
s=br.readLine();
s=s.toLowerCase();
l=s.length();
for(i=97;i<=122;i++)
{
for(j=0;j<l;j++)
{
if(i==(int)(s.charAt(j)))
{
k=k+s.charAt(j);    
}
}
}
System.out.println(k);
}
    }