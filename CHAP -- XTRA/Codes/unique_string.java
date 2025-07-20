import java.io.*;
class unique_string
{
public static void main(String args[])throws IOException
{
int i,c=0,j,l,flag=0,n;
String s;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
for(j=0;j<l;j++)
{
if(s.charAt(i)==s.charAt(j))
{
c++;
}
}
if(c>1)
{
flag=1;
break;
}
c=0;
}
if(flag!=1)
{
System.out.println(s+"is unique");
}
else
{
System.out.println(s+"is not unique");
}
}
}