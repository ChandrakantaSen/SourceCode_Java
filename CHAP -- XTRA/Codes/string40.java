import java.io.*;
class string40
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l,j;
System.out.println("Enter the string : - ");
s=br.readLine();
l=s.length();
k=k+s.charAt(0);
for(i=1;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=k+"."+s.charAt(i+1);
}
}
System.out.println(k);
    }
}