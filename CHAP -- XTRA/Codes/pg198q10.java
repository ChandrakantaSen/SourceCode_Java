import java.io.*;               
class pg198q10
{
public static void main(String args[])throws IOException
{
  int i,l,c,l1;l1=0;String n,k,s=""; char b;c=0;int d;d=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the String");
n=br.readLine();
n=n+" ";
l=n.length();
for(i=0;i<l;i++)
{
if(n.charAt(i)==' ')
{
k=n.substring(c,i);
c=i+1;
if(k.length()>l1)
{
l1=k.length();
s=k;
}
}
}
System.out.println("The longest word is : "+s+" : "+s.length());
}
}
