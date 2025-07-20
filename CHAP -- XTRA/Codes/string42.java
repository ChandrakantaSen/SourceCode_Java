import java.io.*;
class string42
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l,j=0;
System.out.println("Enter the string : - ");
s=br.readLine();
l=s.length();
k=k+s.charAt(0);
for(i=1;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=k+"."+s.charAt(i+1);
 j=i+1;
}
}
for(i=j+1;i<l;i++)
{
k=k+s.charAt(i);
    }
  System.out.println(k);  
    }
}