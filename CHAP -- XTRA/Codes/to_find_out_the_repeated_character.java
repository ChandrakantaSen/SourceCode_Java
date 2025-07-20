import java.io.*;
class to_find_out_the_repeated_character
{
public static void main(String args[])throws IOException
{
int i,c=0,j,l,flag=0,n;
String s,p="";
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
p=p+"";
}
else
{
p=p+s.charAt(i);
}
c=0;
}
System.out.println(p);
}
}